import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int contestants = sc.nextInt();
		int minPos = sc.nextInt();
		int[] array  = new int[contestants];
		int nextRounders = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int minScore = array[minPos-1];
		for (int i = 0; i < array.length; i++) {
			if((array[i] > 0) && (array[i] >= minScore)) nextRounders++;
		}
		
		System.out.println(nextRounders);
	}
}
