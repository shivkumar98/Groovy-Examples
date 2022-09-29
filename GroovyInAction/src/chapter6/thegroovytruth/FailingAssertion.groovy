package chapter6.thegroovytruth
list = [1,2,3]
for (int i =0; i<list.size();i++){
      println i // 0  1  2
}

def store = ''
for (String i in 'a'..'c') store += i
assert store == 'abc'
store = ''
for (i in [1, 2, 3]) {
      store += i
}
assert store == '123'
def myString = 'Equivalent to Java'
store = ''
for (i in 0 ..< myString.size()) {
      store += myString[i]
}
assert store == myString

store = ''
for (i in myString) {
      store += i
}
assert store == myString

for (x in null) println 'This will not be printed!'

def a = 1
while (true) {
      a++
      break
}
assert a == 2

for (i in 0..10){
      if (i==0) continue
      a++
      if (i > 0) break
}
assert a == 3

def myMethod() throws IllegalArgumentException {
      throw new IllegalArgumentException()
}

def log = []
try {
      myMethod()
} catch (Exception e) {
      log << e.toString()
} finally {
      log << 'finally'
}
assert log.size() == 2

