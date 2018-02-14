// you can submit yours at: https://quera.ir/problemset/contest/10231/

import java.util.ArrayList;
import java.util.Scanner;

public class problem{
    public static void main(String[] args){
  
        Scanner sc = new Scanner(System.in);
        
        String word1 = "MOLANA", word2 = "HAFEZ";
        int counter = 0;
        ArrayList answerList = new ArrayList();
        String answer = "";
        
        while(counter < 5){
            
            String line = sc.nextLine();
            if (line.contains(word1) || line.contains(word2)){
                answerList.add(counter+1);
            }
            counter++;
        }
        if (answerList.isEmpty()){
            System.out.println("NOT FOUND!");
        }
        else{
            int size = answerList.size();
            for (int i = 0; i < size; i++){
                if (i != size-1){
                    answer += answerList.get(i).toString() + " ";
                }
                else{
                    answer += answerList.get(i).toString();
                }
            }
            System.out.println(answer);
        }
    }
}
