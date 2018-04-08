import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int aCounter, bCounter,cCounter;
		aCounter = bCounter = cCounter = 0;
		boolean aFlag, bFlag, cFlag;
		aFlag = bFlag = cFlag = false;
		
		
		if((input.length() < 3) || (input.charAt(0) != 'a') || (input.charAt(input.length()-1) != 'c')) {
			result(false);
		}
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == 'a' && !bFlag && !cFlag) {
				aCounter++;
				aFlag = true;
			}
			else if(ch == 'b' && aFlag && !cFlag) {
				bCounter++; 
				bFlag = true;
			}
			else if(ch == 'c' && aFlag && bFlag) {
				cCounter++; 
				cFlag = true;
			}
			else result(false);
		}
		if((aCounter == cCounter) || (bCounter == cCounter)) {
			result(true);
		}
		result(false);
		
	}
	
	public static void result(boolean res) {
		if(res) {
			System.out.println("YES");
			System.exit(0);
		}
		System.out.println("NO");
		System.exit(0);
	}
}
