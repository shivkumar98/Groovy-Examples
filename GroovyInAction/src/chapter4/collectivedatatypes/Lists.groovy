package chapter4.collectivedatatypes

def myList = []

// plus() method:
myList += 'a'
println myList // result: [a]

myList += ['b', 'c']
println myList // result [a, b, c]

// left shift operator:
myList << 'd' << 'e'
println myList // result: [a, b, c, d, e]

// minus
myList = myList - ['c', 'd', 'e']
println myList // result: [a, b]

// multiplication
myList = myList * 3
println myList // [a, b, a, b, a, b]