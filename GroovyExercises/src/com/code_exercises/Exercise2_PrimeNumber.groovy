package com.code_exercises
/*
Write a method that checks if a number is a prime number.
 */

static Boolean isPrime(Integer n){
      if (n<=0){
            return false
      }
      int divisorCount = 0;
      for (i in 1..n){

            if (n%i==0){
                  divisorCount++
            }
      }


      if (divisorCount==2){
            return true
      } else {
            return false
      }
}


assert  isPrime(1) == false
assert  isPrime(2) == true
assert isPrime(0) == false
assert isPrime(154) == false
assert isPrime() == false