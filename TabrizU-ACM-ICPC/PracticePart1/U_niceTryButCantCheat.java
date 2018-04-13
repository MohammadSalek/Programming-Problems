import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int trees = sc.nextInt();
		if(trees == 1) {
			int coordinate = sc.nextInt();
			int height = sc.nextInt();
			System.out.println(1);
			System.exit(0);
			
		}else if(trees == 2) {
			int coordinate = sc.nextInt();
			int height = sc.nextInt();
			System.out.println(2);
			System.exit(0);
		}
		
		int[] coordinates = new int[trees];
		int[] heights = new int[trees];
		for(int i=0; i<trees; i++) {
			coordinates[i] = sc.nextInt();
			heights[i] = sc.nextInt();
		}
		
		
		int[] status = new int[trees];
		
		for(int i=1; i<trees-1; i++) {
			if(heights[i] < (coordinates[i] - coordinates[i-1])) {
				status[i] = 1;
			}
			if(heights[i] < (coordinates[i+1] - coordinates[i])) {
				if(status[i] == 1) {
					status[i] = 3;
				}else {
					status[i] = 2;
				}
			}
		}
		
		Random rand = new Random();
		int counter = 0;
		int max = -1;

		while(counter < 200) {
				
			boolean hasPossibleFallOption = true;
			int threes = 0;
			int cut = 0;
			while(hasPossibleFallOption) {	
				for(int i=1; i<trees-1; i++) {
					
					if(rand.nextInt(2) == 0){
						if(status[i] == 2) {
							cut += 1;
							status[i] = -1;
							if(status[i+1] == 1) {
								status[i+1] = 0;
							}else if(status[i+1] == 3) {
								status[i+1] = 2;
							}
						}else if(status[i] == 1) {
							cut += 1;
							status[i] = -1;
							if(status[i-1] == 2) {
								status[i-1] = 0;
							}else if(status[i-1] == 3) {
								status[i-1] = 1;
							}
						}
					}else {
						if(status[i] == 1) {
							cut += 1;
							status[i] = -1;
							if(status[i-1] == 2) {
								status[i-1] = 0;
							}else if(status[i-1] == 3) {
								status[i-1] = 1;
							}
						}else if(status[i] == 2) {
							cut += 1;
							status[i] = -1;
							if(status[i+1] == 1) {
								status[i+1] = 0;
							}else if(status[i+1] == 3) {
								status[i+1] = 2;
							}
						}
					}
				}
				hasPossibleFallOption = false;
				threes = 0;
				for(int i=1; i<trees-1; i++) {
					if((status[i] == 1) || (status[i] == 2)) {
						hasPossibleFallOption = true;
						break;
					}else if(status[i] == 3) {
						threes++;
					}
				}
			}
			int res = (cut+threes+2);
			max = res>max?res:max;
			counter++;
		}

		System.out.println(max);
	}	
}
