package chapter6.thegroovytruth

assert (1==1)
assert ("hello"=~/...../)
assert ([1])
assert ![]
assert !("")
assert (" ")
assert ("hello")
assert !(0)

//////////////////////
def x = 1
if (x == 2) {
      assert false
}

if (x = 2) {
      println x
}

def store = []
x=3
while (x = x-1){
      store << x
}
assert store == [2, 1]

while (x = 1) {
      println x // prints 1
      break
}

///////////////////////////////
if (true)          assert true
else               assert false

////////////////////////////
def result = (1==1) ? 'ok' : 'failed'
assert result == 'ok'
result = ('some string') ? 10 : ['x']
assert result == 10

/////////////////////////////
switch (10) {
      case 0 : assert false ; break
      case 0..9 : assert false ; break
      case [8,9,11] : assert false ; break
      case Float : assert false ; break
      case {it%3 == 0}: assert false ; break
      case ~/../ : assert true ; break
      default : assert false ; break
}

Object a.equals(b)
Class a.isInstance(b)
Collection a.contains(b)
Range a.contains(b)
Pattern a.matcher(b.toString()).matches()
String (a==null && b==null) || a.equals(b)
Closure a.call(b)