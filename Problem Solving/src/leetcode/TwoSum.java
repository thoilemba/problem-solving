package leetcode;

public class TwoSum {
	
    static public int[] twoSum(int[] nums, int target) {
    	
    	for(int i = 0; i < nums.length-1; i++) {
    		for(int j = i+1; j < nums.length; j++) {
    			if(nums[i] + nums[j] == target) {
    			 return new int[] { i, j };
    			}
    		}
    	}
    	
		return null;
    }

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		
		int[] result = twoSum(nums, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
	}

}
