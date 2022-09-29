package chapter5.workingwithclosures

map = ['a':1, 'b': 2]
map.each { key, value -> map[key] = value*2}
println map // result [a:2, b:4]

map = [a:1, b:2]
doubler = {key, value -> map[key] = value * 2 }
map.each(doubler)
println map // [a:2, b:4]

map = [a:1, b:2]
def doubler(entry){
    map[entry.key] = entry.value *2
}

map.each (this.&doubler)
println map // [a:2, b:4]