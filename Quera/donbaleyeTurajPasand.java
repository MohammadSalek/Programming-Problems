// Attention: Not sure about the code (couldn't submit)
// https://quera.ir/course/assignments/4495/problems/14996

import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();        
        int d = sc.nextInt();
        int res;
        int khune = k - 1;  
        int sum = 0;
        
        if(khune > 0){
            sum = khune * (2*d+1) * (d+1);
                    sum -= (d + 1);
            res = sum;
        }
        else{
            res = d + 1;
        }
        
        System.out.println(res);
    }
}
