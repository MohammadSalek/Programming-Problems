// https://codefights.com/arcade/intro

/*
You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.

Example

For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.string names

    Guaranteed constraints:
    5 ≤ names.length ≤ 15,
    1 ≤ names[i].length ≤ 15.

    [output] array.string

*/

String[] fileNaming(String[] names) {
    int[] points = new int[names.length];
    int j = 0;
    while(j < names.length){
        String name = names[j];
        int counter = 1;
        for(int i = 0; i < names.length; i++){
            if(i == j) continue;
            if(name.equals(names[i])){
                String temp = names[i] + "(" + counter + ")";
                while(seenBefore(names, temp, i)){
                    counter++;
                    temp = names[i] + "(" + counter + ")";
                }
                names[i] = temp;
            }
        }
        counter = 0;
        j++;
    }
    return names;
}
boolean seenBefore(String[] names ,String str, int num){
    for(int i = 0; i < num; i++){
        if(str.equals(names[i])){
            return true;
        }
    }
    return false;
}
