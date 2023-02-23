package section2_simplegroovydatatytpes

// java code:
List<Integer> listOne = Arrays.asList(1,2,3);
List<Integer> listTwo = Arrays.asList(95,100,105);

ArrayList result = new ArrayList();
for (int i=0;i<listOne.size();i++){
      result.add(listOne.get(i)+listTwo.get(i));
}
print result

// groovy code:
def result2 = []
for (int i=0; i<listOne.size();i++){
      result2.add( listOne[i].plus(listTwo[i]) )
}

// number types
int integer = 1;
assert integer.getClass() == Integer

def a = 1
def b = 1.1f
def c = 1.2D
def d = 'C' // no character literal
def e = 'C' as char

long veryBigInteger = 9223372036854775808; // max value + 1
assert veryBigInteger == -9223372036854775808 // numeric overflow
def veryBigInteger2 = 9223372036854775808  // BigInteger is used by default
assert veryBigInteger2 == 9223372036854775808 // no overflow

def preciseFloat = 1.0E-99999
assert preciseFloat.getClass() == BigDecimal

assert "ab" + "cd" - "bc" == "ad"

assert "hello world".minus("world") == "hello world" - "world"

// strings
def name = "Shiv"
def plainJavaString = 'Hello ' + name
plainJavaString = 'Hello ${name}'
println plainJavaString // Hello ${name}

def groovyString = "Hello ${name}"
println groovyString // Hello Shiv

// println plainJavaString.class // class java.lang.String
println groovyString.getClass().getName() // org.codehaus.groovy.runtime.GStringImpl

assert 'abcd' - 'bc' == 'ad'

// String methods

def greeting ="Hello World"
assert greeting.startsWith('Hell')
assert greeting[0] == "H"
assert greeting[6,7] == "Wo"
assert greeting[0..greeting.length()-2] == 'Hello Worl'
assert greeting.substring(6,7) == "W"
assert greeting.count('l') == 3

assert 'x'.padLeft(1) == 'x'
assert 'x'.padLeft(2) == ' x'
assert 'x'.padRight(2) == 'x '

assert 'xy'.padLeft(1) == 'xy'
assert 'xy'.padLeft(2) == 'xy'
assert 'xy'.padLeft(3) == ' xy'
assert 'x'*4 == "xxxx"

def sb = greeting << ""
sb[sb.indexOf('H')..sb.indexOf('o')] = 'Morning'
assert sb.toString() == "Morning World"

assert (new StringBuilder(greeting).replaceAll("^Hello", "Morning").toString())== "Morning World"

float f1 = 0.1f, f2 = 0.2f;
print f1+f2 // 0.30000000447034836

