import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		int[][] array = new int[lines][7];
		
		int counter = 0;
		while(counter < lines) {
			int num = sc.nextInt();
			for(int i=0; i<7; i++) {
				array[counter][7-i-1] = num%10;
				num /= 10;
			}
			counter++;
		}
		
		int c = 0;
		int max = 0;
		for (int i = 0; i < 7; i++) {
			c = 0;
			for (int j = 0; j < array.length; j++) {
				if(array[j][i] == 1) {
					c++;
				}
			}
			if(c > max) {
				max = c;
			}
		}
		System.out.println(max);
	}
}
