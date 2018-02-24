// https://quera.ir/course/assignments/4495/problems

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        
       int a = sc.nextInt();
       int b = sc.nextInt();
       int x = sc.nextInt();
       
       ArrayList<Integer> array_a = new ArrayList<>();
       ArrayList<Integer> array_b = new ArrayList<>();

       //int counter = 0;
       
       for(int i = 1; i <= a/2; i++){
           if(a%i == 0){
               array_a.add(i);
           }
       }
       array_a.add(a);
       
       for(int j = 1; j <= b/2; j++){
           if(b%j == 0){
               array_b.add(j);
           }
       }
       array_b.add(b);

       int counter = 0;
       for(int i = 0; i < array_a.size(); i++){
            for(int j = 0; j < array_b.size(); j++){
                if(array_a.get(i) + array_b.get(j) <= x){
                    counter++;
                }
            }
       }
       System.out.println(counter);  
    }
}
