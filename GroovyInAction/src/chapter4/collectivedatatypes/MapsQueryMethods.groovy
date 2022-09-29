package chapter4.collectivedatatypes

def myMap = [a:1, b:2, c:3]
def other = [b:2, c:3, a:1]

assert  myMap == other

//Normal JDK Methods
println myMap.isEmpty() // false
println myMap.size() // 3

// keySet methods:
println myMap.keySet() // [a,b,c] -- this is a set
println myMap.keySet() == ['a', 'b', 'c'] // false - we need to convert it to a set
println myMap.keySet() == ['a', 'b', 'c'].toSet() // true

// contains methods:
println myMap.containsKey('z') // false
println myMap.containsKey('a') // true
println myMap.containsValue(34) // false
println myMap.containsValue(1) // true
println myMap.values() // [1, 2, 3] - this is a HashMap
println myMap.values().toSet() == [1,2,3].toSet() // true

println "-------------------------"
//methods added by the GDK

println myMap.any {entry -> entry.value > 2} // true
println myMap.every {entry -> entry.key< 'z'} // true

def toSet(list){
      new java.util.HashSet(list)
}

// Iterating through maps
def Map = [a:1,b:2,c:3]

def store = ''
Map.each {entry
      -> store+= entry.key
      store+= entry.value

}
println store // a1b2c3 - this is a string

// iterating over keys/values
store = ''
Map.each{key, value ->
      store+=key
      store+=value
}
println store // a1b2c2 - the above is more syntax friendly

//iterating over just keys
store = ''
for (key in myMap.keySet()){
      store+= key
}
println store // abc

//iterating over just values
store = ''
for (value in myMap.values()){
      store+=value
}
println store //123

store = ''
Map.each {entry -> store+=entry }
println store