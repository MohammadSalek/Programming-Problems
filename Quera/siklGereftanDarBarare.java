//submit yours: https://quera.ir/problemset/contest/10166/

import java.util.Scanner;
import java.util.ArrayList;

class Main {
	private static Scanner sc;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		
		short[] keyvoon = new short[] {3, 3, 1, 1, 2, 2};
		short[] nezam = new short[] {1, 2, 3};
		short[] farhad = new short[] {2, 1, 2, 3};
		
		short points_keyvoon = 0;
		short points_nezam = 0;
		short points_farhad = 0;
		
		String numbers_str = sc.nextLine();
		int numbers = Integer.parseInt(numbers_str);
		
		String seq = sc.nextLine();


		for(short i=0; i<numbers; i++) {
			int selected = Character.getNumericValue(seq.charAt(i));
			
			if(keyvoon[i%6] == selected) {
				points_keyvoon++;
			}
			if(nezam[i%3] == selected) {
				points_nezam++;
			}
			if(farhad[i%4] == selected) {
				points_farhad++;
			}
		}
		
		short max = -1;
		if(max < points_keyvoon) {
			max = points_keyvoon;
		}
		if(max < points_farhad) {
			max = points_farhad;
		}
		if(max < points_nezam) {
			max = points_nezam;
		}
		
		ArrayList<String> winners = new ArrayList<>();
		if(max == points_keyvoon) {
			winners.add("keyvoon");
		}
		if(max == points_nezam) {
			winners.add("nezam");
		}
		if(max == points_farhad) {
			winners.add("shir farhad");	
		}
		
		
		System.out.println(max);
		for(short i=0; i<winners.size(); i++) {
			System.out.println(winners.get(i));
		}
	}
}
