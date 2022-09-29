package com.code_exercises
/*
A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
Write a method that detects if a string is a palindrome.
 */

def Boolean isPalindtome(String word) {
      for (int i in 1..word.size()/2){
            if (!word.charAt(i) == word.charAt(i-1)){
                  return false
            }
            if (i == word.size()/2){
                  return true
            }
      }
}

assert  isPalindtome("yoy") == true
assert isPalindtome("not a palindrome") == false
assert isPalindtome("aba") == true
assert isPalindtome("abc") == false
assert isPalindtome("c") == true
assert isPalindtome("abac") == false
assert isPalindtome("abba") == true