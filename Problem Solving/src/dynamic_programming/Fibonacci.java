package dynamic_programming;

import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
	
	// Using simple recursion:  Time: O(2^n), Space: O(n)
	static int fibonacci(int n) {
		if(n < 0) {
			return -1;
		}
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	// Using Dynamic programming
	//	Memoization technique
	// Time: O(n), Space: O(n)
	
	static HashMap<Integer, Long> memo = new HashMap<Integer, Long>();
	
	static Long fibonacciMemoization(int n) {
		
		if(n < 0) {
			return -1L;
		}
		
		// Base case: Fibonacci of 0 and 1 is 1
		if(n == 0 || n == 1) {
			return 1l;
		}
		
		// Check if the result is already calculated
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		
		// Recursive calls with memoization
		long result = fibonacciMemoization(n-1) + fibonacciMemoization(n-2);
		// Store the result in the memoization map
		memo.put(n, result);
		
		return result;
	}
	
	// Using Tabulation: Time: O(n), Space: O(n)
	static int fibonacciTabulation(int n) {
		if(n < 0) {
			return -1;
		}
		
		int[] table = new int[n+1];
		table[0] = 0;
		table[1]  = 1;
		
		for(int i = 2; i <= n; i++) {
			// Calculate Fibonacci and store the result in the table
			table[i] = table[i-1] + table[i-2];
		}
		
		return table[n];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term: ");
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
		System.out.println(fibonacciMemoization(n));
		System.out.println(fibonacciTabulation(n));
		
		sc.close();

	}

}
