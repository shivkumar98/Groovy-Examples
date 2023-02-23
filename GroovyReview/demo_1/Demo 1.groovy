package demo_1

List<Integer> javaList = new ArrayList<>()
def groovyList = []
javaList.add(21)
groovyList[0] = 22
print groovyList
assert groovyList == [22]
groovyList[3] = 44
println groovyList

def x = 1;
x=x.plus(1)
assert x == 2


// null = false
// not null = true
String name = "shiv";
String greeting = "Hello "
if (name) {
      greeting+= name
} else {
      greeting += "random user";
}
println greeting

def add10(x) {
   return x+10
}

assert 22 == add10(12)
assert 20.1 == add10(10.1)

// lists
def someList = [1,4,7 ]
assert someList[0] == 1
assert someList[-1] == 7

// maps

def someMap = ["key":"value", "secondKey": 2, 3: "hi" ]
assert someMap["key"] == "value"
assert someMap[3] == "hi"

// Range
Range range = 0..10
for (int i=range.from;i<range.to;i++){

}

def stepRange = 0..10
for (def num : stepRange){
      println num
}



// closures
        {
              println "from our anonymous"
        }

def someClosure = {
      String someName -> "Hello ${someName}"
}

print someClosure("Lohit")

def global = "Shiv"
["Shiv", "Lohit", "Kushal"].each( { println "Hello "+ global} )
