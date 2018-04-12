import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int counter1 = sc.nextInt();
		int counter2 = sc.nextInt();		
		int[] seq1 = new int[counter1];
		int[] seq2 = new int[counter2];
		int zeros = 0;
		for (int i = 0; i < counter1; i++) {
			seq1[i] = sc.nextInt();
			if(seq1[i] == 0) zeros++;
		}
		for (int i = 0; i < counter2; i++) {
			seq2[i] = sc.nextInt();
		}
		
		// reverse sort
		Arrays.sort(seq2);
		for (int i = 0; i < seq2.length/2; i++) {
			int temp = seq2[i];
			seq2[i] = seq2[seq2.length - i - 1];
			seq2[seq2.length - i - 1] = temp;	
		}

		
		
		
		if(zeros > counter2) {
			System.out.println("No");
			System.exit(0);
		}
		else if(zeros == counter2) {
			int indexOfSeq2 = 0;
			for (int i = 0; i < counter1; i++) {
				if(seq1[i] == 0) {
					seq1[i] = seq2[indexOfSeq2];
					indexOfSeq2++;
				}
			}
			
			for (int i = 1; i < counter1; i++) {
				if(seq1[i-1] >= seq1[i]) {
					System.out.println("Yes");
					System.exit(0);	
				}
			}
			System.out.println("No");
			System.exit(0);
		
		}
		
		/*else {
			
			int[] seq1_clone = seq1.clone();
			
			int indexCounter = 0;
			while(indexCounter <= (counter2-zeros)) {
				int indexOfSeq2 = indexCounter;
				seq1_clone = seq1.clone();
				t:
					for (int i = 0; i < counter1; i++) {
						if(seq1_clone[i] == 0) {
							seq1_clone[i] = seq2[indexOfSeq2];
							indexOfSeq2++;
						}
						if((i > 0) && (seq1_clone[i-1] > seq1_clone[i])) {
							break t;
						}else {
							if(i == (counter1-1)) {
								System.out.println("Yes");
								System.exit(0);	
							}
						}
					}			
					
				indexCounter++;
			}
		}*/
	}		
}
