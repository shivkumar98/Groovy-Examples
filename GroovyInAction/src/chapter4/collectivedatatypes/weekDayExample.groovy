package chapter4.collectivedatatypes
class Weekday implements Comparable {
      static final DAYS = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
      private int index = 0
      Weekday(String day){
            index = DAYS.indexOf(day)
      }
      Weekday next(){
            return new Weekday(DAYS[(index+1) % DAYS.size()])
      }
      Weekday previous(){
            return new Weekday(DAYS[index-1])
      }
      int compareTo(Object other){
            return this.index <=> other.index
      }
      String toString(){
            return DAYS[index]
      }
}

def mon = new Weekday("Mon")
def fri = new Weekday("Fri")

def weekdays = mon..fri
for (Weekday i: weekdays){
      println i
} // prints: Mon  Tue  Wed  Thu  Fri

def myList = [1,2,3]
println myList.class.name // java.util.ArrayList
def myOtherlist = myList.toList() // List<Integer>


ArrayList explicitList = new ArrayList();
explicitList.addAll(myList)
for ( def i: explicitList){
      println i
} // prints 1 2 3

// overloaded subscript operator
myList = 'a'..'f'
println myList[2..4] // returns [c,d,e]
println myList // returns [a, b, c, d, e, f]
println myList[2..4] // returns [c, d, e]
myList = ['a','b','c','d','e','f']



println  myList[0..2] //  ['a','b','c']
println myList[0,2,4] // ['a','c','e']

myList[0..2] = ['x','y','z']
println myList // [x, y, z, d, e ,f]
myList[3, 5] = ['w', 'v']
println myList // [x, y, z, w, e, v]


def newList = ['a','b','c','d','e','f'] // [a, b, c, d, e, f]
println newList
newList[1..1] = ['b','w','x','y','z']
println newList//[a, b, w, x, y, z, c, d, e, f]
//myList[0] = ['w', 'v'] // this will add a sublist into the list
// what if we wanted to add these two elements at the beginning of the list?

// negative indices
def indices = [0,1,2,3,4,5,6]
println indices[-1] // 6
println indices[-7] // 0
// println indices[-8]  -- out of range
println indices[6..0] //[6,5,4,3,2,1,0]
println indices[-1..-3] // [6, 5, 4]


