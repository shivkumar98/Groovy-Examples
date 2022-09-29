package chapter4.collectivedatatypes

def map = [a:1, b:2, c:3]

// retrieving elements from map
println map['a'] // 1
// NOTE: map[a] will NOT work
println map.get('a') // 1
println map.a // 1

println "-------------"
// attmepting to retrieve non-existent element
println map.d // null
println map['d'] // null
println map.get('d') // null

println "-----------"
//supplying a default value
println map.get('z', 999) // 999
println map // [a:1, b:2, c:3, z:999]

println "--------------"
//assigning values
println map // [a:1, b:2, c:3, z:999]
map['d'] = 24
println map // [a:1, b:2, c:3, z:999, d:24]
map.e = 48
println map // [a:1, b:2, c:3, z:999, d:24, e:48]
