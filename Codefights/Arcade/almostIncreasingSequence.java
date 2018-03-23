// This sh*t took me 2 days to figure out.
// https://codefights.com/arcade/intro


/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Example

    For sequence = [1, 3, 2, 1], the output should be
    almostIncreasingSequence(sequence) = false;

    There is no one element in this array that can be removed in order to get a strictly increasing sequence.

    For sequence = [1, 3, 2], the output should be
    almostIncreasingSequence(sequence) = true.

    You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer sequence

    Guaranteed constraints:
    2 ≤ sequence.length ≤ 105,
    -105 ≤ sequence[i] ≤ 105.

    [output] boolean

    Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
*/



boolean almostIncreasingSequence(int[] sequence) {

  int bad=0;
  int bitchNumIndex = -1;
  int len = sequence.length;
  
  for(int i=0; i<len-1; i++){
     if(sequence[i] >= sequence[i+1]){
       bad++;
       if(bad > 1){
         return false;
       }
       bitchNumIndex = i;
     }
  }
  
  for(int i=1; i<len-2; i++){
    if(sequence[i] >= sequence[i+1]){
      if(i == bitchNumIndex){
        if(sequence[i-1] >= sequence[i+1] && sequence[i] >= sequence[i+2]){
          return false;
        }
      }
    }
  }
  return true;
}
