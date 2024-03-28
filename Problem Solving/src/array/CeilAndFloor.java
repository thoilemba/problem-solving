package array;

import java.util.Scanner;

public class CeilAndFloor {
	/*
	Example.
		arr = 3 5 7 10 12
		ceil(7) = 7
		ceil(9) = 10
		ceil(13) = not exist
		floor(7) = 7
		floor(9) = 7
		floor(2) = not exist
	 */
	
	static int ceil(int[] arr, int key) {
		
		int start = 0;
		int end = arr.length-1;
		
		// binary search
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] == key) {
				return arr[mid];
			}else if(key < arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		if(start < arr.length) {
			return arr[start];
		}else {
			return -1; // not exist
		}
	}
	
	static int floor(int[] arr, int key) {
		
		int start = 0;
		int end = arr.length-1;
		
		// binary search
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] == key) {
				return arr[mid];
			}else if(key < arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		if(end >= 0) {
			return arr[end];
		}else {
			return -1; // not exist
		}
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

		System.out.println("Ceil of the element: "+ ceil(arr, 9));
		System.out.println("Floor of the element: "+ floor(arr, 9));
		
		sc.close();
	}
}
