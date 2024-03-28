package array;

// Get the number of smaller or equal elements in a sorted array

public class CountSmallerEqualElements {
	
	/*
	Example.
	  0 1  2  3  4  5  6  7 - indices
	  2 6 12 18 21 26 33 42 - array
	  26 - key
	  6 - output
	  
	  2 6 12 18 21 26 26 26 - 26(input) 8(output)
	  10 20 30 40 50 - 60(input) 5(output)
	  10 20 30 40 50 - 0(input) 0(output)
	*/
	static int countSmallerEqualElements(int[] arr, int key) {
		
		int start = 0, end = arr.length-1, mid = 0;
		
		while(start <= end) {
			mid = (start+end)/2;
			if(arr[mid] == key) {
				mid++;
				// finding the equal element (duplicate) of the key
				while(mid < arr.length && arr[mid] == key) {
					mid++;
				}
				return mid;
			}else if(key < arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		if(key < arr[mid]) {
			return mid;
		}else {
			return mid+1;
		}
	}

	
	public static void main(String args[]) {
		
		int[] arr1 = {2, 6, 12, 18, 21, 26, 33, 42};
		int[] arr2 = {2, 6, 12, 18, 21, 26, 26, 26};
		int[] arr3 = {10, 20, 30, 40, 50};

		System.out.println(countSmallerEqualElements(arr1, 26));// key found with no duplicate
		System.out.println(countSmallerEqualElements(arr2, 26));// key found with duplicate
		System.out.println(countSmallerEqualElements(arr3, 60));// key not found and key > last mid
		System.out.println(countSmallerEqualElements(arr3, 0)); // key not found and key < last mid
	}
}
