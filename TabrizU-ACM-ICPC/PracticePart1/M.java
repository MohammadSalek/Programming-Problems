import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine(); 
		String[] clock = str.split(":");
		int[] clockNum = new int[] {Integer.parseInt(clock[0]), Integer.parseInt(clock[1])};
		
		do {
			clockNum[1]++;
			if(clockNum[1] == 60) {
				clockNum[0]++;
				clockNum[1] = 0;
			}if(clockNum[0] == 24) {
				clockNum[0] = 0;
			}
		}while(!isPalin(clockNum[0], clockNum[1]));
		
		String clock1 = "" + clockNum[0];
		if(clockNum[0] < 10) clock1 = "0" + clock1;
		String clock2 = "" + clockNum[1];
		if(clockNum[1] < 10) clock2 = "0" + clock2;
			
		System.out.println(clock1 + ":" + clock2);
		
	}
	static boolean isPalin(int first, int second) {
		int secReverse = (second%10)*10 + (second/10);
		return  first == secReverse ? true : false;
	}
}
