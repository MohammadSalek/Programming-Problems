import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] array = new int[num][num];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		ArrayList<Integer> goodCars = new ArrayList<>();	
		for(int i=0; i<num; i++) {
			t:
			{
				for(int j=0; j<num; j++) {
					if((array[i][j] == 3) || (array[i][j] == 1)) {
						break t;
					}
				}
				goodCars.add(i+1);
			}
		}
		
		System.out.println(goodCars.size());
		for(int i=0; i<goodCars.size(); i++) {
			System.out.print(goodCars.get(i) + " ");
		}
	}
}
