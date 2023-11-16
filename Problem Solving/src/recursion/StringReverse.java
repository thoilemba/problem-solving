package recursion;

public class StringReverse {
	
	static String stringReverse(String s, String r, int i) {
		if(i < 0) {
			return r;
		}
		
		return stringReverse(s, r+s.charAt(i), i-1);
		
	}
	
	static boolean checkPalindrome(String s) {
		return s.equals(stringReverse(s, "", s.length()-1));
	}
	
	static boolean isPalindrome(String s, int i, int j) {
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}
		
		if(i >= j) {
			return true;
		}
		
		return isPalindrome(s, i+1, j-1);
	}
	
	
	static void temp(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		String s = "hello";
		System.out.println(stringReverse(s, "", s.length()-1));
		
		System.out.println(checkPalindrome(s));
		System.out.println(checkPalindrome("level"));
		System.out.println(checkPalindrome("madam"));
		
		System.out.println(isPalindrome("level", 0, 4));
		System.out.println(isPalindrome("madam", 0, 4));
		
		int i = 5;
		temp(++i);
		
	}
}
 