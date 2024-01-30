package important_programs;

import java.util.Scanner;

public class Factorial {
	
	// using for loop (e.g. 5! = 1*2*3*4*5)
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	// using while loop (e.g. 5! = 5*4*3*2*1)
	public static int factorial2(int n) {
		int fact = 1;
		while(n > 0) {
			fact = fact * n;
			n--;
		}
		
		return fact;
	}
	
	public static int factorialRecursion(int n) {
		
		if(n <= 0) {
			return 1;
		}
		
		return n * factorialRecursion(n-1);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number (positive only):");
		int number = input.nextInt();
		input.close();
		
		System.out.println(factorial(number));
		System.out.println(factorial2(number));
		System.out.println(factorialRecursion(number));
		
	}

}
