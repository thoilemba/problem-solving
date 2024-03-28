package string;

import java.util.Scanner;

public class PrintAllSubStrings {
	
	/*
	Example.
	  0123 - Indices
	  ABCD - Input
	  
	  Output:
	  A - length 1
	  B
	  C
	  D
	  AB - length 2
	  BC
	  CD
	  ABC - length 3
	  BCD
	  ABCD - length 4
	*/
	
	// Print all the substrings of a String (in order of size)
	public static void printAllSubString(String s) {
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length() - i ;j++) {
				for(int k = j; k <= j+i; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
	
	/*
	Example.
	  0123 - Indices
	  ABCD - Input
	  
	  Output:
	  A - starting index 0
	  AB
	  ABC
	  ABCD
	  B - starting index 1
	  BC
	  BCD
	  C - starting index 2
	  CD
	  D - starting index 3
	*/
	
	// Print all the substrings of a String (in order of index)
	public static void printAllSubString2(String s) {
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length() - i ;j++) {
				for(int k = i; k <= j+i; k++) { // only change here "k=i"
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.next();
		printAllSubString(s);
		System.out.println("-------");
		printAllSubString2(s);
		sc.close();
	}
}
