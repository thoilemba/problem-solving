package array;

import java.util.Scanner;

public class SecondLargestOfAnArray {
	/*
	Example. 20 42 6 25 30 88 = 42
	 */
	
	static int secondLargestOfAnArray(int[] arr) {
		if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
		
		int max1 = arr[0];
		int max2 = arr[0];
		
		if(arr[0] > arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		}else {
			max1 = arr[1];
			max2 = arr[0];
		}
		
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if (arr[i] > max2) {
				 max2 = arr[i];
	        }
		}
		
		return max2;
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

		System.out.println("Second largest element of the array:");
		System.out.println(secondLargestOfAnArray(arr));
		
		sc.close();
	}
}

