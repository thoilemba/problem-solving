package array;

import java.util.Scanner;

public class BitonicSearch {
	
	/*
	 Given a bitonic sequence A of N distinct elements, write a program to find a given element B
	 in the bitonic sequence in O(log n) time.
	
	 A bitonic sequence is a sequence of numbers which is first strictly increasing then after a
	 point strictly decreasing.
	 20 is the bitonic element in [3 9 10 20 17 8 1].
	*/
	
	/*
	 Example.
	 0 1  2  3  4 5 6 - index
	 3 9 10 20 17 8 1 - array
	 input = 17
	 output = 4
	*/
	
	// finding the index of the bitonic element
	static int findBitonicElement(int[] arr) {
		int left = 0, right = arr.length-1, m = 0;

		while(left <= right) {
			m = (left+right)/2;
			if(arr[m] > arr[m-1] && arr[m] > arr[m+1]) {
				return m;
			}else if(arr[m] > arr[m-1] && arr[m] < arr[m+1]) {
				left = m+1;
			}else {
				right = m-1;
			}
		}
		
		return -1;
	}
	
	// Binary search with extra parameter
	static int binarySearch(int[] arr, int key, int startIndex, int endIndex, boolean ascending) {
		
		int start = startIndex, end = endIndex, mid = 0;
		
		while(start <= end) {
			mid = (start+end)/2;
			if(arr[mid] == key) {
				return mid;
			}else if(ascending ? key < arr[mid] : key > arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		return -1;
	}
	
	static int bitonicSearch(int[] arr, int key) {
		
		if(arr.length == 2) {
			return -1; // bitonic array must have at least 3 elements
		}
		
		int bitonicIndex = findBitonicElement(arr);
		
		if(key == arr[bitonicIndex]) {
			return bitonicIndex;
		}
		
		if(key > arr[bitonicIndex]) {
			return -1; // not found, bitonic element is the largest element in the list
		}
		
		int leftResult = binarySearch(arr, key, 0, bitonicIndex-1, true);
		if(leftResult != -1) {
			return leftResult;
		}else {
			return binarySearch(arr, key, bitonicIndex+1, arr.length-1, false);
		}
	}
	
	
	public static void main(String args[]) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the size of the array: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		
//		System.out.println("Enter the elements of the array:");
//		for(int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(bitonicSearch(arr, 17));
//		sc.close();
		
		int[] arr2 = {5, 6, 7, 8, 9, 10, 3, 2, 1};
		System.out.println(bitonicSearch(arr2, 5));
	}
}


//Algorithm:
//
//1. Find the point where the array can be split (Bitonic point).
//2. *Check if the element is at the Bitonic point. If yes return the Bitonic point.
//3. *Otherwise perform the binary search on left and right side of the Bitonic point using Binary search.


