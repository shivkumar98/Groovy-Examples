package chapter5.workingwithclosures

def x = 0
10.times {
      x++
}
println x // 10

// the accumulator problem

def accumulatorGenerator(n){
      return {n+=it}
}
def accumulator = accumulatorGenerator(100)
println accumulator(1) // returns 101

// returning from a closure
println ([1,2,3].collect { return it*2}) // [2,4,6]
println ([1,2,3].collect{ it*2 }) // [2,4,6]

def list = [1,2,3,4,5]
list = list.collect{
      if (it%2==1){
            return it*10
      } else {
            return it
      }
}

println list // [10, 2, 30, 4, 50]