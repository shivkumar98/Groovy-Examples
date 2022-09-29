package com.code_exercises

/*
Write a method that returns a comma-separated string based on a given list of integers.
 Each element should be preceded by the letter 'e'
  if the number is even, and preceded by the letter 'o' if the number is odd.
For example, if the input list is (3,44), the output should be 'o3,e44'.
 */

static String getString(List<Integer> list) {
      String result = "";
      for (int i in list){
            if (i%2==0){
                 result+="e$i,"
            } else {
                  result+="o$i,"
            }
      }
      return result.substring(0, result.size()-1)

}

assert getString([3,4]) == 'o3,e4'