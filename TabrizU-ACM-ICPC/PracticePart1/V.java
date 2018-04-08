import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int[] time = new int[people];
		
		int counter = 0;
		while(counter < people) {
			time[counter] = sc.nextInt();
			counter++;
		}
		
		Arrays.sort(time);
		int result = 0;
		int sum = 0;
		for(int num : time) {
			if(sum <= num) {
				result++;
				sum += num;
			}
			
		}
		
		System.out.println(result); 
	}
}
