package section5_controlstructures

def x = 1
if ('0' as char)
      x = 2
assert x == 2

if (0..1)
      x=3
println x

if (x=4)
      x=5
println x

String name = ''
x = 0
def result = name?(x++):(x--)
assert x == -1

def object = [hello:[nested:1]]
result = object.hello?.nested
println result // 1

object = null
/*
result = object.hello.nested // Caught: java.lang.NullPointerException
 */

def list = [1, 2, 3]

/*
list.each {
      list.remove(it)
}
println list // java.util.ConcurrentModificationException
 */

while (list) {
      list.remove(0)
}
assert list == []