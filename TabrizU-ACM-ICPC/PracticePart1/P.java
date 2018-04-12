import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int len = str1.length();
		
		int[] xor = new int[len];
		int hammingDistance = 0;
		for (int i = 0; i < len; i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				xor[i] = 1;
				hammingDistance++;
			}
		}
		
		if(hammingDistance%2 == 1) {
			System.out.println("impossible");
			System.exit(0);
		}else {
			char[] answer = str1.toCharArray();
			
			for (int i = 0; i < len; i++) {
				if(xor[i] == 1) {
					if(answer[i] == '1') answer[i] = '0';
					else answer[i] = '1';
					hammingDistance -= 2;
				}
				if(hammingDistance == 0) break;
			}
			System.out.println(String.copyValueOf(answer));
			System.exit(0);
		}
	}		
}
