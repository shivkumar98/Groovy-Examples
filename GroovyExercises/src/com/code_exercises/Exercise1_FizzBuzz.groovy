package com.code_exercises
/*Fizz Buzz
Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
        For numbers which are multiples of both three and five return 'com.code_exercises.FizzBuzz'.
        For numbers that are neither, return the input number.
*/

class FizzBuzz {
      def static fizzBuzz(Integer i){
            if (i%3==0 && i%5==0){
                  return "com.code_exercises.FizzBuzz"
            }  else if (i%3==0) {
                  return  "Fizz"
            } else if (i%5==0){
                  return "Buzz"
            } else {
                  return  i
            }
      }
}

assert FizzBuzz.fizzBuzz(1) == 1
assert FizzBuzz.fizzBuzz(5) == "Buzz"
assert FizzBuzz.fizzBuzz(15) == "com.code_exercises.FizzBuzz"
assert FizzBuzz.fizzBuzz(3) == "Fizz"
assert FizzBuzz.fizzBuzz(121) == 121
assert FizzBuzz.fizzBuzz(125) == "Buzz"