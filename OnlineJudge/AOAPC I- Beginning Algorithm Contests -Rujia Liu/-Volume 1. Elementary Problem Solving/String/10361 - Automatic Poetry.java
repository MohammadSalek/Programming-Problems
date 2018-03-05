// submit yours: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1302

import java.util.*;

class Main {
	private static Scanner sc;
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());
		int counter = 0;
		while(counter < lines) {
			String first_line = sc.nextLine();
			String second_line = sc.nextLine();
			
			
			// FIRST LINE			
			boolean read = false;
			boolean readNext = false;
			int readCount = 0;
			String word1 = "";
			String word1_next = "";
			String word2 = "";
			String word2_next = "";
			
			int firstSignIndex = first_line.indexOf("<");
			String new_firstLine = "";
			
			for(int i = 0; i < first_line.length(); i++) {
				char ch = first_line.charAt(i);
				
				if(i < firstSignIndex) {
					new_firstLine += ch;	
				}
				if(ch == '>') {
					read = false;
					readNext = true;
				}
				if(ch == '<') {
					readCount++;
					read = true;
					readNext = false;
				}				
				if(readNext) {
					if(ch != '>') {
						if(readCount == 2) {
							word2_next += ch;
						}
						else if(readCount == 1){
							word1_next += ch;
						}
					}
				}
				if(read) {
					if(ch != '<') {
						if(readCount == 1) {
							word1 += ch;
						}
						else if(readCount == 2) {
							word2 += ch;
						}
					}
				}
			}
			
			// SECOND LINE			
			int firstDotIndex = 0;
			if(second_line.charAt(second_line.indexOf('.') + 1) == '.') {
				firstDotIndex = second_line.indexOf('.');
			}			
			String new_secondLine = "";
			for(int i = 0; i < second_line.length(); i++) {
				char ch = second_line.charAt(i);
				
				if(i < firstDotIndex) {
					new_secondLine += ch;	
				}
			}
			
			System.out.println(new_firstLine + word1 + word1_next + word2 + word2_next);
			System.out.println(new_secondLine + word2 + word1_next + word1 + word2_next);
			
			counter++;
		}		
	}
}
