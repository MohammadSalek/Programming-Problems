import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		for(int i = 0; i < 6; i++) {
			if(i < 3) {
				a[i] = sc.nextInt();
			} else {
				b[i - 3] = sc.nextInt();
			}
		}
		
		long points = 0;
				
		//1
		for(int i = 0; i < 2; i++) {
			if(b[i] > 0 && a[i + 1] > 0) {
				if(b[i] >= a[i + 1]) {
					b[i] -= a[i + 1];
					points += a[i + 1];
					a[i + 1] = 0;
				} else {
					a[i + 1] -= b[i];
					points += b[i];
					b[i] = 0;
				}
			}
		}
		if(b[2] > 0 && a[0] > 0) {
			if(b[2] >= a[0]) {
				b[2] -= a[0];
				points += a[0];
				a[0] = 0;
			} else {
				a[0] -= b[2];
				points += b[2];
				b[2] = 0;
			}
		}

		//2
		for(int i = 0; i < 3; i++) {
			if(b[i] > 0 && a[i] > 0) {
				if(b[i] >= a[i]) {
					b[i] -= a[i];
					a[i] = 0;
				} else {
					a[i] -= b[i];
					b[i] = 0;
				}
			}
		}


		//3 
		for(int i = 2; i >= 1; i--) {
			if(b[i] > 0 && a[i - 1] > 0) {
				if(b[i] >= a[i - 1]) {
					b[i] -= a[i - 1];
					points -= a[i - 1];
					a[i - 1] = 0;
				} else {
					a[i - 1] -= b[i];
					points -= b[i];
					b[i] = 0;
				}
			}
		}
		if(b[0] > 0 && a[2] > 0) {
			if(b[0] >= a[2]) {
				b[0] -= a[2];
				points -= a[2];
				a[2] = 0;
			} else {
				a[2] -= b[0];
				points -= b[0];
				b[0] = 0;
			}
		}
		
		System.out.println(points);
		
	}
}

