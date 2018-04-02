// https://codefights.com/arcade/intro

/*
Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

    2 + 3 = 5;
    3 + 5 = 8;
    5 + 1 = 6;
    1 + 6 = 7.
    Thus, the answer is 8.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer inputArray

    Array of positive integers.

    Guaranteed constraints:
    3 ≤ inputArray.length ≤ 105,
    1 ≤ inputArray[i] ≤ 1000.

    [input] integer k

    An integer (not greater than the length of inputArray).

    Guaranteed constraints:
    1 ≤ k ≤ inputArray.length.

    [output] integer

    The maximal possible sum.
/*


int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
    
    int start = 0;
    int end = k;
    
    while(end <= inputArray.length){
        sum = 0;
        for(int i=start; i<end; i++){
            sum += inputArray[i];
        }
        if(sum > max){
            max = sum;
        }
        start++;
        end++;
    }
    return max;       
}
