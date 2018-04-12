import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int pointM = sc.nextInt();
		int pointV = sc.nextInt();
		int timeM = sc.nextInt();
		int timeV = sc.nextInt();
		
		int pointM_final = Math.max(3*pointM/10, pointM-(pointM/250)*timeM);
		int pointV_final = Math.max(3*pointV/10, pointV-(pointV/250)*timeV);
		
		String winner;
		if(pointM_final == pointV_final) winner = "Tie";
		else winner = pointM_final > pointV_final ? "Misha":"Vasya";
		
		System.out.println(winner);
	}
}
