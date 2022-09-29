package com.edabit

/*findSeat(200, [35, 23, 18, 10, 40]) ➞ 2
// There are 5 carriages which each have a maximum capacity of 40 (200 / 5 = 40).
// Index 0's carriage is too full (35 is 87.5% of the maximum).
// Index 1's carriage is too full (23 is 57.5% of the maximum).
// Index 2's carriage is good enough (18 is 45% of the maximum).
// Return 2.
Examples
findSeat(20, [3, 5, 4, 2]) ➞ 3
findSeat(1000, [50, 20, 80, 90, 100, 60, 30, 50, 80, 60]) ➞ 0
findSeat(200, [35, 23, 40, 21, 38]) ➞ -1
*/

def findSeat =
        { Double capacity, List<Integer> carriages ->
              Double maxCapacity = capacity/carriages.size()
              for( int passengers: carriages) {
                    if (passengers <= 0.5*maxCapacity) {
                          return carriages.indexOf(passengers)
                    }
              }
            return -1

}

assert findSeat(20, [3, 5, 4, 2]) == 3
assert findSeat(1000, [50, 20, 80, 90, 100, 60, 30, 50, 80, 60]) == 0
assert findSeat(200, [35, 23, 40, 21, 38]) == -1

/*
* A pandigital number contains all digits (0-9) at least once. Write a function that takes an integer, returning true if the integer is pandigital, and false otherwise.
Examples
isPandigital(98140723568910) ➞ true
isPandigital(90864523148909) ➞ false
// 7 is missing.
isPandigital(112233445566778899) ➞ false
 */

def isPandigital = {Long x ->
      def arr= x.toString().split("")

      if (arr.contains(0.toString()) && arr.contains(1.toString()) && arr.contains(2.toString()) && arr.contains(3.toString()) && arr.contains(4.toString()) && arr.contains(5.toString()) && arr.contains(6.toString()) &&
              arr.contains(7.toString()) && arr.contains(8.toString()) && arr.contains(9.toString())){
            return true
      } else {
            return false
      }

}


assert isPandigital(11111111111) == false
assert isPandigital(9876543210) == true

/*
 * Write a function that, given the start startNum and end endNum values, return an array containing all the numbers inclusive to that range. See examples below.
Examples
inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5]
inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]
inclusiveArray(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
inclusiveArray(17, 5) ➞ [17]
 */

def inclusiveArray = {
      int startIndex, int endIndex ->
            List<Integer> list = []
            if (startIndex>=endIndex){
                  list << startIndex
                  return list
            }
            for (int i= startIndex; i<=endIndex; i++){
                  list << i
            }
            return list
}

assert inclusiveArray(1,5) == [1,2,3,4,5]
assert inclusiveArray(2, 8) == [2, 3, 4, 5, 6, 7, 8]
assert inclusiveArray(10, 20) == [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
assert inclusiveArray(17, 5) == [17]

/*
 * Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as the sum of its factors, (equal to sum of its proper divisors) excluding the number itself.
	For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.
	Examples
	checkPerfect(6) ➞ true
	checkPerfect(28) ➞ true
	checkPerfect(496) ➞ true
	checkPerfect(12) ➞ false
	checkPerfect(97) ➞ false
 */
def getFactors = {int num ->
      List<Integer> list = []
      for (int i=1; i<num; i++){

            if (num%i==0){
                  list << i
            }
      }
      return list
}
def checkPerfect = {
      int x ->
            int sum = getFactors(x).stream().mapToInt(i ->i).sum()
            return sum == x
}



assert checkPerfect(1) == false
assert checkPerfect(6) == true

/*
 * Write a function that finds the sum of an array. Make your function recursive.
Examples
sum([1, 2, 3, 4]) ➞ 10
sum([1, 2]) ➞ 3
sum([1]) ➞ 1
sum([]) ➞ 0
 */
/*

 * Write a function that finds the sum of an array. Make your function recursive.
Examples
sum([1, 2, 3, 4]) ➞ 10
sum([1, 2]) ➞ 3
sum([1]) ➞ 1
sum([]) ➞ 0
 */

// this will not work:
/*
def sum = {
    ArrayList list ->
          if (list.size()>1){
                return list[list.size()-1] + sum ( list.dropRight(1))
          } else if (list.size()==1) {
          return list[list.size()-1]
    }

}
 */

def sum 
        sum = {
    ArrayList list ->
          if (list.size()>1){
                return list[list.size()-1] + sum ( list.dropRight(1))
          } else if (list.size()==1) {
          return list[list.size()-1]
    }

}

assert sum([12,2]) == 14
assert sum([1,-1,32,23]) == 55

/*
 * Create a function that takes an integer n and reverses it.
Examples
rev(5121) ➞ "1215"
rev(69) ➞ "96"
rev(-122157) ➞ "751221"
Notes
    This challenge is about using two operators that are related to division.
    If the number is negative, treat it like it's positive.
 */

def rev = {
      int n ->
            return n.toString().reverse().toInteger()
}

assert rev(123) == 321
assert rev(112282392) == 293282211

/* Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:
"Player 1 wins"
"Player 2 wins"
"TIE" (if both inputs are the same)
The rules of rock, paper, scissors, if not known:
        Both players have to say either "rock", "paper" or "scissors" at the same time.
        Rock beats scissors, paper beats rock, scissors beat paper.
*/

def rockPaperScissors = {
      String str1, String str2 ->
            if (str1.equals(str2)){
                  return "TIE"
            } else if ((str1.equals("rock") && str2.equals("scissors")) || (str1.equals("paper") && str2.equals("rock")) || (str1.equals("scissors") && str2.equals("paper")) ){
                  return "Player 1 wins"
            } else {
                  return "Player 2 wins"
            }
}

assert rockPaperScissors("rock", "paper") == "Player 2 wins"

/*
You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54"). Create a function that takes the video length and return it in seconds.
Examples
minutesToSeconds("01:00") ➞ 60
minutesToSeconds("13:56") ➞ 836
minutesToSeconds("10:60") ➞ -1
Notes
    The video length is given as a string.
    If the number of seconds is 60 or over, return -1 (see example #3).
    You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid).
 */

def minutesToSeconds =
        {
              String str ->
                    def split = str.split(":")
                    if (split[1].toInteger()>59){
                          return -1
                    }
                    return split[0].toInteger()*60 + split[1].toInteger()
        }

assert minutesToSeconds("01:00") == 60
assert minutesToSeconds("10:60") == -1