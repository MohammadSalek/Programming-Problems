// not the best answer in fewest characters... but still a good practice for using hashmap & iterators :) 
// https://codefights.com/arcade

/*
Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string inputString

    A string consisting of lowercase English letters.

    Guaranteed constraints:
    1 ≤ inputString.length ≤ 50.

    [output] boolean

    true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
*/


boolean palindromeRearranging(String inputString) {
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<inputString.length(); i++){
        Character key = inputString.charAt(i);
        if(map.get(key) != null){
            map.put(key, map.get(key)+1);
        }else{
            map.put(key, 1);
        }
    }
    
    Iterator<Character> iter = map.keySet().iterator();
    
    if(inputString.length()%2 == 0){
        while(iter.hasNext()){
            Character key = iter.next();
            if(map.get(key)%2 != 0){
                return false;
            }
        }
    }else{
        boolean flag = false;
        while(iter.hasNext()){
            Character key = iter.next();
            if(map.get(key)%2 != 0){
                if(!flag){
                    flag = true;
                }else{
                    return false;
                }
            }
        }
    }
    return true;
}
