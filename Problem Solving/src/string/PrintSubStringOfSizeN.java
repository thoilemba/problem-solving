package string;

import java.util.Scanner;

public class PrintSubStringOfSizeN {
	
	/*
	Example.
	  012345 - Indices
	  ABCDEF, 3 - Input
	  
	  Output:
	  ABC
	  BCD
	  CDE
	  DEF
	*/
	
	// Print all the substrings of a String of size n
	public static void printSubStringOfSizeN(String s, int n) {
		for(int i = 0; i <= s.length()-n; i++) {
			for(int j = i; j < s.length()-n+i ;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

	
	// Print all the substrings of a String of size n
	public static void printSubStringOfSizeN2(String s, int n) {
		
		for(int i = 0; i <= s.length()-n; i++) {
			String sub = "";
			int j = i;
			int count = 0;
			while(count < n) {
				sub = sub + s.charAt(j++);
				count++;
			}
			System.out.println(sub);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.next();
		int n = 3;
		printSubStringOfSizeN(s, n);
		System.out.println("-------");
		printSubStringOfSizeN2(s, n);
		sc.close();
	}
}
