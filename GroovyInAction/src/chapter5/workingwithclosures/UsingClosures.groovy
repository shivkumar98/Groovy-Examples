package chapter5.workingwithclosures

def x = {
      x,y -> x+y
}

println x(3,4) // 7
println x.call(2,3) // 5

def benchmark(repeat, Closure worker){
      start= System.currentTimeMillis()

      // calling the closure:
      repeat.times{worker(it)}
      stop = System.currentTimeMillis()
      return stop - start
}

slowBenchmark = benchmark(10000, {(int) it / 2})
println slowBenchmark // 90

fastBenchmark = benchmark(10000){ it.intdiv(2)}
println fastBenchmark // 15

def caller (Closure C){
      return C.getParameterTypes().size()
}

println caller {y -> y} // 1
println caller {it} //1
println caller {a,b ->} // 2

// currying methods

def adder = { w,v -> w*w + v*v*v}

def adderFour = adder.curry(2)
println adderFour(2) // 12

println ([1,2,3].grep{it>1}) // [2, 3]

