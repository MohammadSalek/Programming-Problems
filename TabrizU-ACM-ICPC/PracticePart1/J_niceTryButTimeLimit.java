import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		BigInteger bigNum;
		BigInteger[] antworten = new BigInteger[num];
		
		for(int i=0; i<num; i++) {
			bigNum = new BigInteger(sc.nextLine());
			boolean beautyFlag = false;	
			int lastDigit = bigNum.mod(BigInteger.TEN).intValue();			
			
			while(!beautyFlag) {
				bigNum = bigNum.subtract(BigInteger.ONE);
				lastDigit--;
				if(lastDigit == -1) {
					bigNum = makeItEven(bigNum);
					lastDigit = 9;
				}				
				beautyFlag = isBeautiful(bigNum);				
			}

			antworten[i] = bigNum;
		}
		for(int i=0; i<num; i++) {
			System.out.println(antworten[i]);
		}
	}

	static BigInteger makeItEven(BigInteger num) {	
		int digits = num.toString().length();
		if(digits%2 == 1) {
			char[] array = new char[digits-1];
			for(int i=0; i<digits-1; i++) {
				array[i] = '9';
			}
			return new BigInteger(new String(array));
		}else {
			return num;
		}
	}

	static boolean isBeautiful(BigInteger num) {				
		int[] numbers = new int[10];
		char[] numStr = (num.toString()).toCharArray() ;				
		int counter = numStr.length - 1;
		
		while(counter >= 0) {							
			numbers[(int) numStr[counter]-'0']++;
			counter--;				
		}
		for (int i = 0; i < 10; i++) {
			if(numbers[i]%2 != 0) {
				return false;
			}
		}
		return true;
	}	
}
