package chapter4.collectivedatatypes

def myMap = [a:1, b:2, c:3]
println myMap //[a:1, b:2, c:3]
myMap.clear() // this empties the map
println myMap // [:]

// removing entries
myMap = [a:1, b:2, c:3]
// deleting on key
myMap.remove('a')
println myMap // [b:2, c:3]


// findAll
myMap = [a:1, b:2, c:3, d:3]

myMap = myMap.findAll {key, value -> value== 3}
println myMap //[c:3, d:3]

myMap = [c:3, d:4]
println myMap.find{entry -> entry.value==3} // c=3
println myMap.find{entry -> entry.value==3}.key // c
println myMap.find{entry -> entry.value>20} // null

println "---------------------------"
myMap = [a:1,b:2,c:3,d:3]
def subMap = myMap.subMap(['a','b'])
println subMap // [a:1, b:2]


def doubled = myMap.collect {entry -> entry.value*2}
println doubled // [2, 4, 6, 6] - this is a list

def keys = myMap.collect {entry -> entry.key}
println keys // [a, b, c, d] - this is a list

def myOriginalList = [56,35,45]
myMap.collect(myOriginalList){entry -> entry.value}
println myOriginalList // [56, 35, 45, 1, 2, 3, 3]