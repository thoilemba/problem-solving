package leetcode;

import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numberList = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	boolean check = numberList.add(nums[i]);
        	if(check == false) {
        		return true;
        	}
        }
		
		return false;
    }
	

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1, 2, 3, 4}));
		System.out.println(containsDuplicate(new int[] {1, 2, 3, 4, 1}));
	
	}

}


