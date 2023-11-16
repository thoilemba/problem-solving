package recursion;

import java.util.Scanner;

public class Fibonacci {
	
	static int fibonacci(int n) {
		
		if(n < 1) {
			return -1;
		}
		
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 2;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));

		sc.close();

	}

}
