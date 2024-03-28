package array;

import java.util.Scanner;

public class SpanOfAnArray {
	/*
	Span of an array = max element - min element
	Example. 10 38 -24 85 0 = 85 - (-24) = 109
	 */
	
	static int spanOfAnArray(int[] arr) {
		if(arr.length == 1) {
			return 0;
		}
		
		int result = 0;
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
//		System.out.println(max +" "+ min);
		result = max - min;
		
		return result;
	}

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of the array:");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Span of the array:");
		System.out.println(spanOfAnArray(arr));
		
		sc.close();
	}
}
