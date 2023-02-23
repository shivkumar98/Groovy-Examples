package section4_closures

// closures are like methods which are not associated with a class
// they can be referenced (named) and passed around (or used literally)

Closure printItems = {
     println it
}

// should we specify the type?
// its optional!  More flexible if we dont


[1,2,3].each(printItems)
"Hello World".each(printItems)

/* to declare closure with more than 1 variable
      We MUST declare the parameters
 */

Closure closure = {

      it -> println it
            println "it" + it

}

def map = ["key":"value"]

map.each {key, value ->
      println key +" "+ value
}

log1 = ''
log2 = ''
(1..10).each{ counter ->
      log1 += counter
      log2 += counter
}
assert log1 == log2

// convert this function into a closure
map =[a:1,b:2]

def doubler = {
      // why does this not work: it*2
      it.value =it.value*2
}

map.each(doubler)

assert map == [a:2,b:4]

// defining a function
def doublerFunction(entry){
     entry.value = entry.value*2
}

// treating map like closure
map.each(this.&doublerFunction)

assert map == [a:4, b:8]

// sum:
def adder = { x,y->
     return x+y
      x-y // will this work?
}
println adder(2,3) // 5

println adder.call(2,3)


// using default value
map.each {println "it" + it
}