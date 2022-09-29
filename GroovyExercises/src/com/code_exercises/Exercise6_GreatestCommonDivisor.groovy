package com.code_exercises
/*
The Greatest Common Divisor of two positive integers is the largest integer that divides
both without remainder.
Write a method that returns the Greatest Common Divisor of p and q.
 */

 static int gcd(Integer p, Integer q){
      def pDivisors = []
      def qDivisors = []
      for (i in 1..p){
            if (p%i==0){
                  pDivisors << i
            }
      }
      for (j in 1..q){
            if (q%j==0){
                  qDivisors << j
            }
      }



      def commonDivisors = []
      for (int element:pDivisors){
            if (qDivisors.contains(element)){
                  commonDivisors << element
            }
      }


      return commonDivisors[commonDivisors.size()-1]


}

assert gcd(55,5) == 5
assert gcd(16,4) == 4
assert gcd(1052,52) == 4
assert gcd(15,65	) == 5
assert gcd(55,54) == 1
