import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int first = -1;
		for(int i=1; i<=n; i++) {
			if(k <= i*m*2) {
				first = i;
				break;
			}
		}
		int second = -1;
		int temp = (first-1)*m*2;
		for(int i=1; i<=m; i++) {
			temp += 2;
			if(k <= temp) {
				second = i;
				break;
			}
		}
		String side = k%2==1?"L":"R";
		
		System.out.println(first + " " + second + " " + side);

	}	
}
