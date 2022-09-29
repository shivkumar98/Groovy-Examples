package com.code_exercises

/*
Write a method that returns the nth element of the Fibonacci Sequence
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
The next number is found by adding up the two numbers before it.
Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
 */
class FibonacciNumbers{
      static def fib(Integer i){
            if (i<=0){
                  return 0
            }
            def fibonacciSeq = [0,1]
            for (j in 0..i){
                  if (j>=2)
                        fibonacciSeq << fibonacciSeq[j-1]+fibonacciSeq[j-2]
            }
            return fibonacciSeq[fibonacciSeq.size()-1]
      }
}

assert FibonacciNumbers.fib(0) == 0

assert FibonacciNumbers.fib(3) == 2

assert FibonacciNumbers.fib(9) == 34