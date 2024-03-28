package leetcode;

// Find the first and the last position of an element in a sorted array
public class FirstLastPosition {
	
	/*
	Example.
	0 1 2 3 4  5 - indices
	5 7 7 8 8 10 - sorted array
	8(target) - [3,4] (output)
	6(target) - [-1,-1] (output)
	*/
	static int[] searchRange(int[] nums, int target) {
		
		int start = 0, end = nums.length-1, mid = 0;
		
		while(start <= end) {
			mid = (start+end)/2;
			if(nums[mid] == target) {
				int temp = mid;
				// searching on the left side
				while(temp-1 >= 0 && nums[temp-1] == target) {
					temp--;
				}
				// searching on the right side
				while(mid+1 < nums.length && nums[mid+1] == target) {
					mid++;
				}
				
				return new int[] {temp, mid};
			}else if(target < nums[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		return new int[] {-1, -1};
	}
	
	// more efficient
	static int[] searchRange2(int[] nums, int target) {
		// finding first
		int start = 0, end = nums.length-1, mid = 0;
		int[] result = {-1, -1};
		
		while(start <= end) {
			mid = (start+end)/2;
			if(nums[mid] == target) {
				result[0] = mid;
				end = mid-1;
			}else if(target < nums[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		// finding last
		start = 0; end = nums.length-1; mid = 0;
		
		while(start <= end) {
			mid = (start+end)/2;
			if(nums[mid] == target) {
				result[1] = mid;
				start = mid+1;
			}else if(target < nums[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		int[] nums1 = {5, 7, 7, 8, 8, 10};
		int[] nums2 = {3, 4, 4, 4, 4, 4, 4, 4, 4, 5};
		int[] nums3 = {};
		
		int[] result1 = searchRange2(nums1, 8);
		int[] result2 = searchRange2(nums1, 6);
		int[] result3 = searchRange2(nums2, 4);
		int[] result4 = searchRange2(nums3, 5);

		System.out.println(result1[0] +" "+ result1[1]);
		System.out.println(result2[0] +" "+ result2[1]);
		System.out.println(result3[0] +" "+ result3[1]);
		System.out.println(result4[0] +" "+ result4[1]);
	}
}
