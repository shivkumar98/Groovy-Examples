package com.code_exercises

import java.util.stream.Collectors

/*
Given a list of strings,
 write a method that returns a list of all
  strings that start with the letter 'a' (lower case)
 and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.
 */

def static List<String> search(List<String> list) {
      return list.stream()
              .filter(str -> str.startsWithAny('a'))
              .filter(str -> str.length()==3)
              .collect(Collectors.toList())

}


assert search(["abc","bbb"]) == ["abc"]
assert search(["ab","abcd"]) == []
assert search(["aaa"]) == ["aaa"]