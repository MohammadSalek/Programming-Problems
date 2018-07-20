import java.util.Scanner;

public class segment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		
		String[] s = sc.nextLine().split("e");
		
		float f = Float.parseFloat(s[0]);
		int ten = Integer.parseInt(s[1]);
		
		int res = 0;
		if(f == (int) f) {
			res += nums[(int) f];
			res += nums[0] * ten;
		} else {
			String[] s1 = s[0].split("\\.");
			int x = Integer.parseInt(s1[0] + s1[1]);
			int counter = 0;
			while(x != 0) {
				res += nums[x%10];
				x /= 10;
				counter++;
			}
			res += nums[0] * (ten - counter + 1);
		}
		
		System.out.println(res);
	}
}
