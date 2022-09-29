/*
Write a method that checks if there is at least on pair
of numbers which sum equals target.
arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five.
 */

static boolean sumsToTarget(int[] arr, Integer target){
      for (int i =0; i<arr.length;i++){
            for (int j = 0; j<arr.length && i!=j;j++){
                  if (arr[i]+arr[j] == target){
                        return true;
                  }
            }
      }
      return false;
}

assert sumsToTarget(new int[] {1,3,4}, 5) == true
assert sumsToTarget( new int[] {2,4,6},5) == false
assert sumsToTarget(new int[] {-1,4,2,1}, 0) == true
assert sumsToTarget(new int[] {-1,4,2,1}, 1) == true