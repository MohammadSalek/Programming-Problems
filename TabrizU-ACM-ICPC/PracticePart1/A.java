import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int answer = 0;
		
		int num = sc.nextInt();
		int[] array = new int[num];
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		for (int i = 1; i < array.length; i++) {
			if(array[i-1] == 0) {
				continue;
			} else if(array[i-1] != array[i]) {
				answer++;
			}
		}
		answer++;
		
		System.out.println(answer);
		
	}
}
