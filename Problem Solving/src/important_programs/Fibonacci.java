package important_programs;

import java.util.Scanner;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		
		if(n <= 0) {
			System.out.println("Term must be greater than 0.");
			return -1;
		}
		
		if(n == 1) {
			return 0;
		}
		
		if(n == 2) {
			return 1;
		}
	
		int fibo = 1;
		int first = 0;
		int second = 1;
		
		// finding n-2 next terms because first two term are considered as 0 and 1
		for(int i = 1; i <= n-2; i++) {
			fibo = first + second;
			first = second;
			second = fibo;
		}
		
		return fibo;
	}
	
	public static int fibonacciRecursion(int n) {
		
		if(n <= 0) {
			System.out.println("Term must be greater than 0.");
			return -1;
		}
		
		if(n == 1) {
			return 0;  // first term
		}
		if(n == 2) {
			return 1; // second term
		}
		
		// if we don't want to counted the 0 and 1 as first and second term,
		// in the result, return 1 when n=1 and return 2 when n=2
		
		return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
	}
	
	public static void fibonacciSeries(int n) {
		
		if(n <= 0) {
			System.out.println("Term must be greater than 0.");
			return;
		}
		
		if(n == 1) {
			System.out.println("0");
			return;
		}
		
		if(n == 2) {
			System.out.println("0 1");
			return;
		}
	
		int fibo = 1;
		int first = 0;
		int second = 1;
		
		System.out.print("0 1 ");
		
		// finding n-2 next terms because first two term are considered as 0 and 1
		for(int i = 1; i <= n-2; i++) {
			fibo = first + second;
			first = second;
			second = fibo;
			System.out.print(fibo +" ");
		}
	}

	
	public static void fibonacciSeriesRecursion(int n) {
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term :");
		int term = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacci(term));
		System.out.println(fibonacciRecursion(term));
		
		System.out.println("*****Series*****");
		
		fibonacciSeries(term);
		System.out.println();
//		fibonacciSeriesRecursion(term);

	}

}
