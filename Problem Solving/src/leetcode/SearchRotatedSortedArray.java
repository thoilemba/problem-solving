package leetcode;

public class SearchRotatedSortedArray {
	
	/*
	Example.
	0 1 2 3 4 5 6 - indices
	4 5 6 7 8 1 2 - array
	5 target 1 output
	8 target 4 output
	
	0 1 2 3 4 5 6 - indices
	7 8 1 2 4 5 6 - array
	5 target 5 output
	8 target 14 output
	*/
	
    public static int searchRotatedSortedArray(int[] nums, int target) {
        
    	int start = 0, end = nums.length-1, mid = 0;
    	
    	while(start <= end) {
    		mid = (start+end)/2;
    		if(nums[mid] == target) {
    			return mid;
    		}
    		// left sorted portion
    		else if(nums[start] <= nums[mid]) {
    			if(target >= nums[start] && target < nums[mid]) {
    				end = mid-1;
    			}else {
    				start = mid+1;
    			}
    		}
    		// right sorted portion
    		else {
    			if(target > nums[mid] && target <= nums[end]) {
    				start = mid+1;
    			}else {
    				end = mid-1;
    			}
    		}
    	}
    	
    	return -1;
    }

	public static void main(String[] args) {
		int[] arr1 = {4, 5, 6, 7, 8, 1, 2};
		int[] arr2 = {7, 8, 1, 2, 4, 5, 6};
		
		System.out.println(searchRotatedSortedArray(arr1, 5));
		System.out.println(searchRotatedSortedArray(arr2, 5));

	}
}
