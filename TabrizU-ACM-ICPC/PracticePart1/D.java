import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		int setSize = sc.nextInt();
		int theNum = sc.nextInt();
		ArrayList<Integer> array1 = new ArrayList<>();
				
		int counter = 0;
		while(counter < setSize) {
			array1.add(sc.nextInt());
			counter++;
		}
		
		int operations = 0;
		for (int i = 0; i < theNum+1; i++) {
			if(!array1.contains(i)) {	
				if(i == theNum) {
					System.out.println(0);
					System.exit(0);
				}
				else{
					while(i < theNum) {
						if (array1.contains(i))
							operations--;
						i++;
						operations++;
					}
				}
			}
		}
		
		if(array1.contains(theNum)) {
				operations++;
		}
		
		System.out.println(operations);
	}
}
