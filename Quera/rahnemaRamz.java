// https://quera.ir/problemset/contest/17902/%D8%B3%D8%A4%D8%A7%D9%84%D8%A7%D8%AA-%D9%85%D8%B3%D8%A7%D8%A8%D9%82%D9%87_%D8%B1%D9%85%D8%B2
import java.util.Scanner;

public class rahnemaRamz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = 0;
		int k = Integer.valueOf(sc.nextLine());
		
		String password = sc.nextLine();
		int indx = 0;
		int counter = 0;
		while(counter < k) {
			int target = Integer.parseInt(password.charAt(counter) + "");
			int number = sc.nextInt();
			for(int i = 0; i < 9; i++) {
				if((number % 10) == target) {
					indx = i + 1;
					break;
				}
				number /= 10;
			}
			
			indx = indx < (9 - indx) ? indx : (9 - indx) ;

			answer += indx;
			counter++;
		}
		System.out.println(answer);
	}
}
