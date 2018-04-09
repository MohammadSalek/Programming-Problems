import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int numLines = sc.nextInt();
		int limit = sc.nextInt();
		boolean[] status = new boolean[limit+1];
		
		int answer  = 0;
		
		int line = 0;
		while(line < numLines) {
			int num = sc.nextInt();
			for(int i=0; i<status.length; i++) {
				status[i] = false;
			}
			
			while(num != 0) {
				int remainder = num%10;
				if(remainder <= limit) {
					status[remainder] = true;
				}
				num /= 10;
			}
			
			int trueCounter = 0;
			for(int i=0; i<status.length; i++) {
				if(status[i]) trueCounter++; 
				else break;
			}
			if(trueCounter == status.length) answer++;
			
			line++;
		}
		System.out.println(answer);
	}
}
