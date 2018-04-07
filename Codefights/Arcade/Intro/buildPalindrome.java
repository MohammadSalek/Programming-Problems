// https://codefights.com/arcade/intro

/*
Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string st

    A string consisting of lowercase latin letters.

    Guaranteed constraints:
    3 ≤ st.length ≤ 10.

    [output] string
*/


String buildPalindrome(String st) {
    
    if(isPalindrome(st)){
        return st;
    }
    
    String stBackWards = revereIt(st);
    int len = stBackWards.length();
    
    int end = 1;
    int start = 0;
    while(true){
        String temp = "";
        for(int i=start; i<start+end && start+end<=len; i++){
            temp += stBackWards.charAt(i);
            System.out.println(temp);
        }
        start++;
        if(isPalindrome(st+temp)){
            return st+temp;
        }
        if(start+end > len){
            start = 0;
            end++;
        }
    }
}
boolean isPalindrome(String str){
    for(int i=0; i<str.length()/2; i++){
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
    }
    return true;
}
String revereIt(String str){
    String reverse = "";
    for(int i=str.length()-1; i>=0; i--){
        reverse += str.charAt(i);
    }
    return reverse;
}
