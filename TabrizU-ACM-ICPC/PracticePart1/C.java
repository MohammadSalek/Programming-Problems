import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		int teams = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		
		for(int i=1; i <= teams; i++) {
			listA.add(i);
		}
		
		int counter = 1;
		while(teams != 1) {
			for (int i = 1; i < listA.size(); i+=2) {
				int team1 = listA.get(i-1);
				int team2 = listA.get(i);				
				
				if(((team1 == a) && (team2 == b))
				|| ((team1 == b) && (team2 == a))) {
					
					if(teams == 2) {
						System.out.println("Final!");
						System.exit(0);
					}
					
					System.out.println(counter);
					System.exit(0);
				}
				else if((team1 == a) && (team2 != b)){
					listB.add(a);
				}
				else if((team1 == b) && (team2 != a)){
					listB.add(b);
				}
				else {
					listB.add(listA.get(i));
				}
			}
			
			listA = new ArrayList<>(listB);
			listB.clear();
			
			teams /= 2;
			counter++;
		}
		
		if(teams == 1) {
			System.out.println("Final!");
			System.exit(0);
		}	
	}
}
