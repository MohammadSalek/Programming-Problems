import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int column, row;
		String[] temp1 = sc.nextLine().split(" ");
		column = Integer.parseInt(temp1[0]);
		row = Integer.parseInt(temp1[1]);
		
		
		if((column < 2) || (row < 2)) {
			System.out.println(0);
			System.exit(0);
		}
		
		char[][] array = new char[column][row];
		
		for (int i=0; i<column; i++) {
			String temp = sc.nextLine();
			for (int j=0; j<row; j++) {				
				array[i][j] = temp.charAt(j);
			}
		}
		
		int faceCounter = 0;
		boolean f, a, c, e;
		f = a = c = e = false;
		for (int i = 1; i < column; i++) {
			for (int j = 1; j < row; j++) {	

				if((array[i][j] == 'f') ||
				(array[i-1][j] == 'f' ) ||
				(array[i][j-1] == 'f' ) ||
				(array[i-1][j-1] == 'f' )) {
					f = true;
				}
				if((array[i][j] == 'a') ||
				(array[i-1][j] == 'a' ) ||
				(array[i][j-1] == 'a' ) ||
				(array[i-1][j-1] == 'a' )) {
					a = true;
				}
				if((array[i][j] == 'c') ||
				(array[i-1][j] == 'c' ) ||
				(array[i][j-1] == 'c' ) ||
				(array[i-1][j-1] == 'c' )) {
					c = true;
				}
				if((array[i][j] == 'e') ||
				(array[i-1][j] == 'e' ) ||
				(array[i][j-1] == 'e' ) ||
				(array[i-1][j-1] == 'e' )) {
					e = true;
				}
				
				if(f && a && c && e) {
					faceCounter++;
				}
				f = a = c = e = false;
			}
		}

		System.out.println(faceCounter);
	}		
}
