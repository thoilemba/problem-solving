package leetcode;

public class PalindromeNumber {
	
    static public boolean isPalindrome(int x) {
    	
    	String valueInString = Integer.toString(x);
    	
    	for(int i = 0; i < valueInString.length(); i++) {
    		
    	}
    	
    	int start = 0;
    	int end = valueInString.length()-1;
    	
    	while(start < end) {
    		if(valueInString.charAt(start) != valueInString.charAt(end)) {
    			return false;
    		}
    		start++;
    		end--;
    	}
    	
		return true;
    }
    
    // Without converting into String
    static public boolean isPalindrome2(int x) {
    	
    	int value = x, reverse = 0;

        while(x>0){
            int lastDigit = x%10;
            reverse = reverse*10 + lastDigit;
            x = x/10;
        }

        if (value == reverse) return true;
        return false; 
    }

	public static void main(String[] args) {

		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome2(-121));

	}

}
