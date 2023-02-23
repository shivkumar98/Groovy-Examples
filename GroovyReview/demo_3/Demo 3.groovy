package demo_3

def list = [1,2,3]
println list[1]


assert [1,2,3]+[7,6,8] == [1,2,3,7,6,8]

list << 4
assert list == [1,2,3,4]

assert [1,2,3]+[4] == [1,2,3,4]

assert [1,2,3] <<  [4]== [1,2,3,[4]]


assert [1,2]*2 == [ 1,2,1,2]

[4,89].each {
     println it*2
}


list.eachWithIndex{ x,  asdesa ->

}

// ranges
/*
for (c in 'a'..'z'){
      println c
}
 */

// print "hello"++ // doesn't work

// date

def num =0
switch (num){

}

// maps

def map = new HashMap()
map = [:]
map = [string1: 1, string2: 2, string:3]

map.get("string1") // 1
map["string1"]
//assert map.get("stringx", -999)
assert map.get("stringx") == null

map.each {key, value->

}

map.any {}
map.every {}