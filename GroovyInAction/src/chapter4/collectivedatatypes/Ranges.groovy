package chapter4.collectivedatatypes

def x = 1..3
for (int i: x){
      println i
} // prints 1  2  3

println x.class.name

def y = 2<..0
for (int i: y){
      println i
} // prints 1  0

def z = 1<..<2
for (int i: z){
      println("Here is element in z"+i)
}
// this prints out nothing

//explicit instantiation
def a = new IntRange(1,3)
for (int i: a){
      println i
}
// this prints 1  2  3

// We can also create ranges of type double
def b = 0.0..1.0

for (def i : b){
      println i
}
// this prints 0.1   1.0
println b.class.name // groovy.lang.NumberRange

def c = new NumberRange(0.0,1.0,0.2)
for (double i : c){
      println i
} // prints 0.0  02  0.4  0.6  0.8  1.0

// creating ranges of dates
def today = new Date()
def yesterday = today - 1
def dates = today..yesterday
for (Date i : dates ){
      println i
}
// prints: Tue Feb 15 10:31:07 GMT 2022
//  Mon Feb 14 10:31:07 GMT 2022

//lets attempt to make a number with digits 9 to 0
// here is the java way:
String largeNum = "";
for (int i=0;i<10;i++){
      largeNum += String.valueOf(i)
}
System.out.println(largeNum) // result: 0123456789

// groovy way
def log = ""
for (int i:0..9){
      log+=i
}
println log //0123456789

//using a closure
log = ""
(9..0).each {element -> log+=element }
println log // prints 9876543210

def stringRange = 'a'..'d'
for (String i: stringRange){
      println i
}
// prints a  b  c  d
println stringRange.class.name // prints groovy.lang.ObjectRange

