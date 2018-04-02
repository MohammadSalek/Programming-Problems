// https://codefights.com/arcade/intro

/*
Given an array of equal-length strings, check if it is possible to rearrange the strings in such a way that after the rearrangement the strings at consecutive positions would differ by exactly one character.

Example

    For inputArray = ["aba", "bbb", "bab"], the output should be
    stringsRearrangement(inputArray) = false;

    All rearrangements don't satisfy the description condition.

    For inputArray = ["ab", "bb", "aa"], the output should be
    stringsRearrangement(inputArray) = true.

    Strings can be rearranged in the following way: "aa", "ab", "bb".
    Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.string inputArray

    A non-empty array of strings of lowercase letters.

    Guaranteed constraints:
    2 ≤ inputArray.length ≤ 10,
    1 ≤ inputArray[i].length ≤ 15.

    [output] boolean
*/


boolean stringsRearrangement(String[] inputArray) {
    
    ArrayList<String> array = new ArrayList<>(Arrays.asList(inputArray));
    
    int counter = 0;
    while(counter < 100000){
        int d1Counter = 0;
        b:
        for(int i=0; i<array.size()-1; i++){
            if(array.get(i).equals(array.get(i+1))){
                break b;
            }
            boolean flag = false;
            for(int j=0; j<inputArray[0].length(); j++){
                if(array.get(i).charAt(j) != array.get(i+1).charAt(j)){
                    if(flag){
                        break b;
                    }
                    flag = true;
                }
            }
            d1Counter++;
        }
        if(d1Counter == array.size()-1){
            return true;
        }
        Collections.shuffle(array);
        counter++;
    }
    return false;
}

