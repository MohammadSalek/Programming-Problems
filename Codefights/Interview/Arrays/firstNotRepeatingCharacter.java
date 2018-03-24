char firstNotRepeatingCharacter(String s) {
    ArrayList<Character> charArray = new ArrayList<>();
    int[] alph = new int[26];
    
    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(alph[ch-97] == 0){
            alph[ch-97] = 1;
        }
        else{
            alph[ch-97] += 1;
        }
    }
    for(int i=0; i<26; i++){
        if(alph[i] == 1){
            charArray.add((char)(i+97));
        }
    }
    
    if(charArray.size() == 0){
        return '_';
    }
    char result = charArray.get(0);
    for(char ch:charArray){
        if(s.indexOf(ch) < s.indexOf(result)){
            result = ch;
        }
    }
    return result;
}
