package section3_collectivetypes

import org.w3c.dom.ranges.Range


// RE: Number Methods

      // n.times{} lets you execute a closure n times
      // E.g., let's append "Shiv" 4 times to "Hello"
      def str = "Hello"
      4.times {
            str += "Shiv"
      }
      assert str == "HelloShivShivShivShiv"

      // a.upto(b) {} let's you iterate between a and b in steps of 1
      def arr = []
      0.1.upto(2.4){
            arr << it
      }
      assert arr == [0.1, 1.1, 2.1]


      // y.downTo(x) {} lets you iterate down from y to x
      def arr2 = []
      (-1).downto(-4){
            arr2 << it
      }
      assert arr2 == [-1,-2,-3,-4]

      // a.step(b, stepSize) {}
      def arr3 = []
      0.1.step(0.5, 0.1){
            arr3 << it
      }
      assert arr3 == [0.1,0.2,0.3,0.4]

      // I want to create an array with varying step size [0.0, 0.1, 0.3, 0.6, 1.0]
      def arrVaryingStep = [0.0]
      for (num in 1..4){
            arrVaryingStep << arrVaryingStep[arrVaryingStep.size()-1] + 0.1 * num
      }
      println arrVaryingStep // [0.0, 0.1, 0.3, 0.6, 1.0]

// Working with Ranges

      /*
       Typically a range is declared as a..b
       We also see half-exclusive range: a..<b
       */

      assert (0..10).contains(0) && (0..10).contains(10)

      assert (0<..<10).contains(1) && !(0<..<10).contains(10) && !(0<..<10).contains(10)

      /* NOT ALLOWED
      for (word in "hello".."world"){
            println word
      }
       */

      1..10
      1..<10 // 1<..10 and 1<..<10 also allowed

      // can be explicitly constructed:
      def range = new IntRange(1,2)

      // each method on a range

      def range2 = ((-0.1)..(1.2))

      // cannot do "hello world"++

// Working with Lists

      def list = [1,2,3]
      List list2 = [1,2,3]
      assert list2.class.name == 'java.util.ArrayList'

      // subscript notation
      assert ('a'..'z')[2..4] == ['c', 'd', 'e']

      assert ['a','h'] + ['s', 'z'] == ['a','h','s', 'z']
      assert [1,2,3,4] - [4,1] == [2,3]

      assert [1,2] != [2,1];

      def ls = ['a']
      ls += [['b']]
      println ls
      def ls2 = ['a'] << ['b', 'c']
      // behaviour is more expected with left-shift
      println ls2

      def listA = ['a','b','c']
      def listB = ['d','e','f']

// List Manipulation

      // algebra
      assert [[1,2],3].flatten() == [1,2,3]
      assert ['a','b','c'].intersect(['b','a']) == ['a','b']
      assert [4,5,6].disjoint([1]) == true

      list = [1,2,3]
      list.pop()
      assert list == [2,3]

      list = ['a', 'b', 'c']
      list.remove(0)
      list.remove('b')
      assert list == ['c']

      // transform through collect
      list = [1,2,3]
      def times2 = list.collect{
            it*2
      }
      assert times2 == [2,4,6]

      // finding elements using find and findAll
      list = [1,2,3,4]
      assert list.find {it%2==0} == 2
      assert list.find{it==999} == null
      assert list.findAll{ it%2==0 } == [2,4]
      assert list.findAll{ it==999 } == []

      /* other methods
      list.min()
      list.max()
      list.count("Some object")
      list.last()

      list.every{ someCondition(it) }
      list.any{someCondition(it)}

      list.each {}
      list.reverseEach {}
      list.eachWithIndex{ int entry, int i -> }

      list.join("some string")
      list.sum {}
      list.inject(1) {x,y-> }
      */

// Working with maps

// inserting values into maps
def map = [:]
map.put("key", "value")
assert map == ['key':'value']

def hashMap = new HashMap()
hashMap.put("key", "value")
assert hashMap == ['key':'value']

// access methods
map = [string1:1, string2:2, string3:3]
assert map.get("string1") == 1
assert map["string1"] == 1
assert map.get("random", "defaultValue") == "defaultValue" // this instructs what the default value should be
assert map.string1 == 1
assert map.random == 'defaultValue'

//
def myMap = [a:1, b:2, c:3]
def other = [b:2, c:3, a:1]
assert myMap == other
assert !myMap.isEmpty()
assert myMap.size() == 3
assert myMap.containsKey('a')
assert myMap.containsValue(1)
assert myMap.any {entry -> entry.value > 2 }
assert myMap.every {entry -> entry.key < 'd'}
assert myMap.keySet() == ['a','b','c'] as Set
assert myMap.values().toList() == [1, 2, 3]
