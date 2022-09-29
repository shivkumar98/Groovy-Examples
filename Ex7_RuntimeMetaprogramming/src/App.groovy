// GroovyObject
class Monkey {
      Integer bananas = 0
      String greeting = "Give me a banana"

      void giveBanana(){
            bananas+=1
      }
      def invokeMethod(String name, Object args){
           println "this method: $name with argument: $args does not exist"
      }
      def getProperty(String name){
            if (metaClass.hasProperty(this,name)) {
                  metaClass.getProperty(this, name)
            } else {
                  "you cannot get this property, it does not exist"
            }
      }
            void setProperty(String name, Object value){
                  this.@"$name" = 9999
            }
}

Monkey monkey = new Monkey()
monkey.eatBananas(1) // result: this method: eatBananas with argument: [1] does not exist

println monkey.bananas // result: 0 as expected
println monkey.oranges // you cannot get this property, it does not exist

monkey.bananas = 2
println monkey.bananas // result: 9999

/////////////////////////////////////////////////////////////////////////
//expando
Expando e = new Expando();
e.property = 1
e.timesTwo ={number -> println number*2}
println e.property // result: 1
e.timesTwo(4) //result: 8

monkey.metaClass.apples = 4
println monkey.apples //result: 4
monkey.metaClass.throwsBananas = { println "throws $bananas bananas at you"}
monkey.throwsBananas() // result: throws 9999 bananas at you

/////////////////////////////////////////////////////////////////////////
//timesTwo
Integer.metaClass.timesTwo{ delegate*2 }
println 2.timesTwo() // result: 4
class IntegerTimesTwoCategory  {
      static  void timesTwo (Integer integer){
            println integer*2
      }
}
use (IntegerTimesTwoCategory){
      11.timesTwo() //result: 22
}