package recursion;

import java.util.Scanner;

public class Factorial {
	
	// n! = n*(n-1)!
	
	static int factorial(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println(factorial(n));

		sc.close();
	}

}
