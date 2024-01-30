package important_programs;

import java.util.Scanner;

public class SumNaturalNumber {
	
	public static int sumOfNaturalNumber(int n) {
		
		int result = n*(n+1)/2;
		
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(sumOfNaturalNumber(n));
	}
}
