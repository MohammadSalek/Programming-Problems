import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String[] nums = sc.nextLine().split(" ");
		int lenS = Integer.parseInt(nums[0]);
		int lenT = Integer.parseInt(nums[1]);
		
		
		String sStr = sc.nextLine();
		String tStr = sc.nextLine();
		
		char[] sArray = new char[lenS];
		char[] tArray = new char[lenT];
		for (int i = 0; i < lenS; i++) {
			sArray[i] = sStr.charAt(i);
		}for (int i = 0; i < lenT; i++) {
			tArray[i] = tStr.charAt(i);
		}
		
		boolean found = false;
		int letterReducer = 0;
		int res = -1;
		
		loop:
			while(!found) {

				int counter = 0;
				int start = 0;
				
				while(start <= (lenT - lenS)) {
					int k = 0;
					for(int p=start; p<start+lenS; p++) {
						if(tArray[p] == sArray[k]) {
							counter++;
						}
						k++;
					}
					if(counter == (lenS - letterReducer)) {
						res = start;
						break loop;
					}
					counter = 0;
					start++;
				}
				letterReducer++;
								
			}
		
		int answerCount = 0;
		String answer = "";
		int j = 0;
		
		for(int i = res; i < res+lenS; i++) {
			if(tArray[i] != sArray[j]) {
				answerCount++;
				answer += (j+1) + " ";
			}
			j++;
		}
		System.out.println(answerCount);
		System.out.println(answer);
	}
}

