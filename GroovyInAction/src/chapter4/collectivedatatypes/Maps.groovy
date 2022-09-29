package chapter4.collectivedatatypes

def map = [:]
println map.getClass().getName() //  java.util.LinkedHashMap

map << [a:1]
map << ['b':7]
map << ["String": 2]
map << [3:4]

println map //[a:1, b:7, String:2, 3:4]

////////////////////////////////////////
// Using variables as a key
def x = 'z'

map << [x:73] // this does not work as expected
println map // [a:1, b:7, String:2, 3:4, x:73]
map << [(x):73] // using the parentheses allows us to use the value of x
println map // [a:1, b:7, String:2, 3:4, x:73, z:73]


