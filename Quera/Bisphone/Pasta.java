// not a complete answer :p

import java.util.Scanner;

public class Pasta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				int abcd = sc.nextInt();
			}
		}
		
		String j = 
				"0 1 1 " + 
				"0 2 2 " + 
				"1 1 1 " + 
				"2 2 2 " + 
				"3 2 3 " + 
				"6 1 3 " + 
				"6 2 2 " + 
				"7 2 1 " + 
				"8 1 3";
		
		String arr[] = j.split(" ");
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i != 0 && counter % 3 == 0) {
				System.out.println();
			}
			System.out.print(arr[i] + " ");
			counter++;
		}
	}
}
