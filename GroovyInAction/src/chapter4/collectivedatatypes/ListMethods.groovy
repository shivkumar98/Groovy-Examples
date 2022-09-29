package chapter4.collectivedatatypes

// manipulating list methods
def unflattenedList = [[1], [2,3], 4]
println unflattenedList.flatten() //[1, 2, 3, 4]

// we can treat a list like a stack
list = [1,2,3]
popped = list.pop()
println popped // 1 - the pop() method returns the first item of the list
println list // [2,3] - the initial list has been modified

// reversing the list
println list.reverse() // 3 2

// sorting list
println list.sort() // [2, 3]

// custom sorting
def randomList = [ [2], [0,1],  [-1,0]]
println randomList.sort { a,b -> a[0] <=> b[0]}
// result: [[-1, 0], [0, 1], [2]]

list = ['a', 'b', 'c']
list.remove(1)
println list // [a.c]

list = [ 'a', 'a', 'b', 'c', 'c', 'c']
list.remove('c')
println list // [a, a, b, c, c]


list = [ 'a', 'a', 'b', 'c', 'c', 'c']
list.removeAll(['a', 'c'])
println list // [b]

list = [1,2,3]
def doubledList = list.collect{ element -> element*2}
println doubledList // [2, 4, 6]

list = [1,1,2,3,4,3,3,2,2]
filteredList = list.find(element -> element%2 ==0)
println filteredList // 2
filteredListV2 = list.findAll(element -> element%2 ==0)
println filteredListV2 // [2, 4, 2, 2]

println "------------------"

list = [1,2,3]
otherList = [2,3,4]
AnotherList = [56]
println list.intersect(otherList) // [2, 3]
println list.disjoint(AnotherList) // true

println "------------------"

// removing nulls and duplicates from lists
x = [1, 1, 1]
x = new HashSet<>(x).toList()
println x // [1]

x = [1,1,1]
println x.unique() // [1]

println "--------------"

//removing nulls
x = [ null, 1, null]
x = x.findAll{ element -> element!=null}
println x // [1]

x = [ null, 1, null]
println x.grep{it} // [1]

