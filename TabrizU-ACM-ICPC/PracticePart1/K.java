import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> res = new ArrayList<>();
		
		while(num%2 == 0) {
			res.add(2);
			num /= 2;
		}

		int temp = num;
		for(int i=3; i<=temp; i+=2) {
			boolean prime = false;
			while(!prime) {
				loop:
				{
					for(int j=3; j*j<=i; j++) {
						if((i != j) && (i%j == 0)) {
							i+=2;
							break loop;
						}
					}
					prime = true;
				}
			}
			
			while(num%i == 0) {
				res.add(i);
				num /= i;
			}
		}		
		
		int len = res.size();
		if(len < k) {
			System.out.println(-1);
			System.exit(0);
		}
		
		String ans = "";
		for(int i=0; i<k-1; i++) {
			ans += res.get(i) + " ";
		}
		
		int last = 1;
		for(int i=k-1; i<len; i++) {
			last *= res.get(i);
		}
		ans += last + "";
		
		System.out.println(ans);
	}	
}

