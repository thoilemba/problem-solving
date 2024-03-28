package important_programs;

import java.util.Scanner;

public class Fibonacci2 {
	
//	0  1  
//	1  2  3  5  8  13  21  34  55  89  144  233  377  610  987  1597  2584  4181
//	First term starts from 1 and second from 2 and so on.
	
	public static int fibonacci(int n) {
		
		if(n < 1) {
			return -1;
		}
		
		int first = 0;
		int second = 1;
		int fibo = 0;
		
		for(int i = 1; i <= n; i++) {
			fibo = first + second;
			first = second;
			second = fibo;
		}
		
		return fibo;
	}
	
	public static int fibonacciRecursion(int n) {
		
		if(n < 1) {
			return -1;
		}
		
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 2;
		}
		
		return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
	}
	
	public static void printFibonacci(int n) {
		
		if(n < 1) {
			System.out.print(-1);
		}
		
		int first = 0;
		int second = 1;
		int fibo = 0;
		
		for(int i = 1; i <= n; i++) {
			fibo = first + second;
			first = second;
			second = fibo;
			
			System.out.print(fibo+" ");
		}
	}
	
	static int first = 0;
	static int second = 1;
	static int fibo = 0;
	
	public static void printFibonacciRecursion(int n) {
		
		
		if(n < 1) {
			return;
		}
		
		fibo = first + second;
		first = second;
		second = fibo;
		System.out.print(fibo +" ");
		
		printFibonacciRecursion(n-1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci: "+ fibonacci(n));
		System.out.println("Fibonacci Recursion: "+ fibonacciRecursion(n));
		
		System.out.println("Print Fibonacci : ");
		printFibonacci(n);
		
		System.out.println("\nPrint Fibonacci Recursion: ");
		printFibonacciRecursion(n);
		
		sc.close();
	}
}
