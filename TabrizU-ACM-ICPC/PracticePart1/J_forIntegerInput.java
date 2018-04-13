import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int nums =  sc.nextInt();
		int[] uglyNums = new int[nums];
		int[] beautifulNums = new int[nums];
		
		for (int i = 0; i < nums; i++) {
			uglyNums[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < nums; i++) {
			int num = uglyNums[i];
			boolean beautyFlag = false;
			while(!beautyFlag) {
				num--;
				if(num <  10) {
					break;
				}
				num = makeItEven(num);
				beautyFlag = isBeautiful(num);
			}
			beautifulNums[i] = num;
		}
		
		for(int i=0; i<nums; i++) {
			System.out.println(beautifulNums[i]);
		}
		
	}
	
	static int makeItEven(int num) {
		int temp = num;
		int counter = 0;
		while(temp != 0) {
			temp /= 10;
			counter++;
		}
		if(counter%2 == 0) {
			return num;
		}else {
			return (int) (Math.pow(10, counter-1)-1);
		}
	}

	
	static boolean isBeautiful(int num) {			
		int[] numbers = new int[10];
		while(num != 0) {
			numbers[num%10]++;
			num /= 10;
		}
		for (int i = 0; i < 10; i++) {
			if(numbers[i]%2 != 0) {
				return false;
			}
		}
		return true;
	}
}
