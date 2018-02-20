
// submit yours: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=94&problem=1241&mosmsg=Submission+received+with+ID+20803943

import java.util.Scanner;

public class problem {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int counter = 0;

        while(counter < lines){
            
            int farmer_count = sc.nextInt();
            int meter = 0, envValue = 0, sum = 0;
            
            for(int i = 0; i < farmer_count; i++){
               for(int j = 0; j < 3; j++){
                    if(j == 0){
                        meter = sc.nextInt();
                    } 
                    if(j == 1){
                        int bullshit = sc.nextInt();
                        continue;
                    }
                    if(j == 2){
                        envValue = sc.nextInt();
                    }
                }
                sum += meter * envValue;
            }
            System.out.println(sum);
            counter++;
        }
    }
}
