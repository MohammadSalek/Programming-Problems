import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int callRate = sc.nextInt();
		int artistRate = sc.nextInt();
		int totalMins = sc.nextInt();
		int kills = 0;
		int counter = 1;
		while(counter <= totalMins) {
			if((counter%artistRate == 0) && (counter%callRate == 0)) kills++;
			counter++;
		}
		
		System.out.println(kills);
	}		
}



