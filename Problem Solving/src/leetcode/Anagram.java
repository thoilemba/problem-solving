package leetcode;

import java.util.Arrays;

public class Anagram {
	
    public static boolean isAnagram(String s, String t) {
    	
    	if(s.length() != t.length()) {
    		return false;
    	}
    	
    	char[] arr1 = s.toCharArray();
    	char[] arr2 = t.toCharArray();
    	
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	
    	int i = 0;
    	while(i < arr1.length) {
    		if(arr1[i] != arr2[i]) {
    			return false;
    		}
    		i++;
    	}
    	
    	
    	return true;
    }

	public static void main(String[] args) {
		
		String s = "anagra";
		String t = "nagaram";
		
		System.out.println(isAnagram(s, t));
		
	}

}
