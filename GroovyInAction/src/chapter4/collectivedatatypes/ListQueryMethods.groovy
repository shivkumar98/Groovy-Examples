package chapter4.collectivedatatypes

def list = [1,2,2,3,3,4,5]

println list.find{x -> x>0} // 1
println list.count(2) // 2

println list.any { item -> item<3} // true
println list.every(item -> item < 3) // false

def product = 1
list.each {element -> product*=element}
println product // 720

println list.inject(1){prod, element -> prod=prod*element} // 720