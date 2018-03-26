// https://codefights.com/arcade

/*
You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.

Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.

Example

For string s = "a(bc)de", the output should be
reverseParentheses(s) = "acbde".

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string s

    A string consisting of English letters, punctuation marks, whitespace characters and brackets. It is guaranteed that parentheses form a regular bracket sequence.

    Constraints:
    5 ≤ s.length ≤ 55.

    [output] string

*/

String reverseParentheses(String s) {
    int start, end;
    start = end = -1;

    for(int i=0; i<s.length(); i++) {
        if(s.charAt(i) == '(') {
            start = i;
        }else if(s.charAt(i) == ')') {
            end = i;
            StringBuffer buffer = new StringBuffer(s.substring(start+1, end)).reverse();
            return reverseParentheses(s.substring(0, start) + buffer + s.substring(end+1));
        }
    }
    return s;
}
