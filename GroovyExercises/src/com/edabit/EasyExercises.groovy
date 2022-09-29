package com.edabit

import com.thoughtworks.xstream.converters.reflection.XStream12FieldKeySorter

/*
 * Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
Examples
calculator(2, '+', 2) ➞ 4
calculator(2, '*', 2) ➞ 4
calculator(4, '/', 2) ➞ 2
Notes
If the input tries to divide by 0, return 0.
 */

def calculator = {int operand1, String operator, int operand2
      -> switch (operator){
            case "+":
                  return operand1+operand2
                  break
            case "-":
                  return operand1-operand2
                  break
            case "*":
                  return operand1*operand2
                  break
            case "/":
                  if (operand2==0){
                        return 0
                  }
                        return operand1/operand2
      }
}

assert calculator(1,"+",2) == 3
assert calculator(12,"/", 0) == 0
assert calculator(1,"-",2) == -1

/*
 * checkEnding("abc", "bc") ➞ true
checkEnding("abc", "d") ➞ false
checkEnding("samurai", "zi") ➞ false
checkEnding("feminine", "nine") ➞ true
checkEnding("convention", "tio") ➞ false
 */

def checkeEnding = {String str1,String str2

      -> if (str2.length()>str1.length()){
            return false
      }
            return str1.substring(str1.length()-str2.length(),str1.length()).toString().equals(str2)
}
assert checkeEnding("Hello", "ll") == false
assert checkeEnding("Hello", "hello deary") == false
assert checkeEnding("Hello", "Hello") == true

/* Write a function that returns true if there exists at least one number that is larger than or equal to n.
Examples
existsHigher([5, 3, 15, 22, 4], 10) ➞ true
existsHigher([1, 2, 3, 4, 5], 8) ➞ false
existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
existsHigher([], 5) ➞ false
Notes
Return false for an empty array [].
*/
 def existsHigher = {List<Integer> list, Integer x
      -> return list.stream().filter(i->i>=x).toArray().size()>0
 }

assert existsHigher([1,2,3,4,5], 100) == false
assert existsHigher([1,2,3,4], -1) == true

/*
 *
 * Create a function that takes two arguments: the original price and the
 * discount percentage as integers and returns the final price after the discount.
Alternative Text
Examples
discount(1500, 50) ➞ 750
discount(89, 20) ➞ 71.2
 *
 */

def discount = { int price, int discount
            -> return price - price*discount/100.0
}

assert discount(1500, 50) == 750
assert discount(89,20) == 71.2

/*countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5
*/
def countWords = { String str
->
      return str.split(" ").length
}

assert countWords("Just an example here") == 4
assert countWords(" ") == 0

/*
 * countTrue([true, false, false, true, false]) ➞ 2
countTrue([false, false, false, false]) ➞ 0
countTrue([]) ➞ 0
 */

def countTrue = { List<Boolean> list ->
      return list.stream().filter( bool -> bool == true).toArray().size()
}

assert countTrue([true, true, true]) == 3
assert countTrue([true, false, true]) != 3
assert countTrue([true, false, true]) == 2

/*
 * How Many Solutions Does This Quadratic Have?
A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x. Given a, b and c, you should return the number of solutions to the equation.
Examples
solutions(1, 0, -1) ➞ 2
// x² - 1 = 0 has two solutions (x = 1 and x = -1).
solutions(1, 0, 0) ➞ 1
// x² = 0 has one solution (x = 0).
solutions(1, 0, 1) ➞ 0
// x² + 1 = 0 has no real solutions.
Notes
    You do not have to calculate the solutions, just return how many there are.
    a will always be non-zero.
 */

def solutions = {int a, int b, int c
      ->
            def determinant = b*b - 4*a*c
            if (determinant> 0){
                  return 2
            } else if (determinant == 0){
                  return 1
            } else {
                  return 0
            }
}

assert solutions(1,0,-1) == 2
assert solutions(1,0,1) == 0
assert solutions(1,0,0) == 1

/*
 * Shuffle the Name
Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.
Examples
nameShuffle("Donald Trump") ➞ "Trump Donald"
nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 */

def nameShuffle = {String name
->
      def names = name.split(" ")
      if (names.length == 2){
            return names[1] + " " + names[0]
      }
      return name
}

assert nameShuffle("Donald Trump") == "Trump Donald"
assert nameShuffle("Rosie O'Donnell") == "O'Donnell Rosie"
assert nameShuffle("Seymour Butts") == "Butts Seymour"

/*
 * This Triangular Number Sequence is generated from a pattern of dots that form a triangle. The first 5 numbers of the sequence, or dots, are:
1, 3, 6, 10, 15
This means that the first triangle has just one dot, the second one has three dots, the third one has 6 dots and so on.
Write a function that returns the number of dots when given its corresponding triangle number of the sequence.
Examples
triangle(1) ➞ 1
triangle(6) ➞ 21
triangle(215) ➞ 23220
 */

def triangle= {int num
      ->
      def triangularNumbers = [1];
      def increment = 1
      for (int i =1; i<num; i++){
            increment++
            triangularNumbers<< triangularNumbers[triangularNumbers.size()-1]+increment
      }
      return triangularNumbers[triangularNumbers.size()-1]
}

assert triangle(1) == 1
assert triangle(2) == 3
assert triangle(3) == 6
assert triangle(215) == 23220