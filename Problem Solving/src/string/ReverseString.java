package string;

import java.util.Scanner;

public class ReverseString {
	
	/*
	Example.
	 01234 - Indices
	 ABCDE - Input
	 EDCBA - Output 
	 */
	
	// Reverse Traversing
	// Time: O(n); Space: O(n)
	static String reverseString(String s) {
		String result = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		
		return result;
	}
	
	
	// Swapping by converting into char array
	// Time: O(n); Space: O(n)
	static String reverseString2(String s) {
		char arr[] = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		
		while(start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return new String(arr);
	}
	
	// Using Recursion
	// Time: O(n); Space: O(n)
	static String reverseStringRecursion(String s) {

		if(s.isEmpty() || s.length() == 1) {
			return s;
		}
		// Reverse the substring excluding the first character,
        // then append the first character at the end.
		return reverseStringRecursion(s.substring(1)) + s.charAt(0);
	}
	
	 private static void helper(char[] arr, int left, int right) {
		 if (left >= right) return;
		 char tmp = arr[left];
		 arr[left++] = arr[right];
		 arr[right--] = tmp;
		 helper(arr, left, right);
	}
	
	// Time: O(n/2); Space: O(n/2)
	static String reverseStringRecursion2(String s) {
		char[] arr = s.toCharArray();
		helper(arr, 0, arr.length - 1);
		return new String(arr);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.next();
		
		System.out.println("Using backward traversal:");
		System.out.println(reverseString(s));
		System.out.println("Using two pointer swapping:");
		System.out.println(reverseString2(s));
		System.out.println("Using recursion 1:");
		System.out.println(reverseStringRecursion(s));
		System.out.println("Using recursion 2:");
		System.out.println(reverseStringRecursion2(s));
		sc.close();

	}

}
