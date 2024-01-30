package important_programs;

import java.util.Scanner;

public class LargestAmongThree {
	
	static int largestAmongThree(int a, int b, int c) {
		
		if(a > b && a > c) {
			return a;
		}else if(b > c) {
			return b;
		}else {
			return c;
		}
	}
	
	static int largestAmongThree2(int a, int b, int c) {
		
		return (a > b && a > c) ? a : ((b > c)? b : c);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three numbers :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		
		System.out.println(largestAmongThree(a, b, c));
		System.out.println(largestAmongThree2(a, b, c));
	}

}
