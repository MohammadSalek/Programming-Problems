import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int candidates = sc.nextInt();
		int cities = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<candidates; i++) {
			map.put(i, 0);
		}
		
		
		for (int i=0; i<cities; i++) {
			int index = -1;
			int max = -1;
			for (int j=0; j<candidates; j++) {
				int vote = sc.nextInt();
				if(vote > max) {
					max = vote;
					index = j;
				}
			}
			map.put(index, map.get(index)+1);
		}
		
		int index = -1;
		int max = -1;
		for (int i=0; i<candidates; i++) {
			if(map.get(i) > max) {
				max = map.get(i);
				index = i;
			}
		}
		System.out.println(index+1);
	}		
}
