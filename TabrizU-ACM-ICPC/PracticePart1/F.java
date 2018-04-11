import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int k = sc.nextInt();
		int[] alphabet = new int[26];

		if(str.length() < k) {
			System.out.println("impossible");
			System.exit(0);
		}
		if(k == 1) {
			System.out.println(0);
			System.exit(0);
		}
		
		for(int i=0; i<str.length(); i++) {
			int num = ((int) str.charAt(i)) - 97;
			alphabet[num]++; 
		}
		 
		int ones = 0;
		int moreThanOne = 0; 
		for(int i=0; i<alphabet.length; i++) {
			int num = alphabet[i]; 
			if(num == 0) continue;
			else if(num == 1) ones++;
			else moreThanOne++;
		}
		
		if(ones >= k) {
			System.out.println(0);
		}else {
			if((k - ones - moreThanOne) < 0) {
				System.out.println(0);
			}
			else {
				System.out.println(k - ones - moreThanOne);
				System.exit(0);
			}	
		}
	}
}
