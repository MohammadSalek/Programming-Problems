// you can submit here: http://goo.gl/vMh6gi

import java.util.Scanner;

public class problem{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int lines = sc.nextInt();
    int distance_total = sc.nextInt();
    
    int min_to_the_end = 0;
    int previous_light_position = 0;
    int counter = 0;
    int min_to_the_light = 0, min_redLight, min_greenLight, remainder;
    
    while(counter < lines){
        min_to_the_light = sc.nextInt();
        min_redLight = sc.nextInt();
        min_greenLight = sc.nextInt();

        counter++;
        min_to_the_end += (min_to_the_light - previous_light_position);
        
        remainder = min_to_the_end%(min_redLight + min_greenLight); 
     
         if (remainder < min_redLight){
            min_to_the_end += (min_redLight - remainder);
        }
        previous_light_position = min_to_the_light;
    }
    
    min_to_the_end += (distance_total - min_to_the_light);
    
    System.out.println(min_to_the_end);
  }
}
