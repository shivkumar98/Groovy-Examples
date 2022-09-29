package chapter5.workingwithclosures

log = ''
(1..10).each{ counter -> log += counter }
println log // 12345678910

log = ''
(1..10).each() {log+=it}
println log // 12345678910

def printer = { line -> println line}

def Closure getPrinter() {
      return { line -> println it}
}

getPrinter()