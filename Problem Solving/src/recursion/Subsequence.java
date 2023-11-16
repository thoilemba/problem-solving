package recursion;

import java.util.ArrayList;

/*
 Subsequence of a given sequence is a sequence that can be derived from the given sequence
 by deleting some or no elements without changing the order of the remaining elements.
 Example. Subsequence of abc = abc, ab, ac, bc, a, b, c and empty value.
 Formula = 2^n where n = length of the given sequence
*/

public class Subsequence {
	
	static void subsequence(String s, String ans) {
		 if(s.length() == 0) {
			 System.out.println(ans);
			 return;
		 }
		 // Pick (which means all the subsequence that contain the pick one)
		 subsequence(s.substring(1), ans+s.charAt(0));
		 // Not pick
		 subsequence(s.substring(1), ans);
		 
	}

	static ArrayList<String> al = new ArrayList<String>();
	
	static void subsequence2(String s, String ans) {
		 if(s.length() == 0) {
			 al.add(ans);
			 return;
		 }
		 // Pick (which means all the subsequence that contain the pick one)
		 subsequence2(s.substring(1), ans+s.charAt(0));
		 // Not pick
		 subsequence2(s.substring(1), ans);
		 
	}
	
	public static void main(String[] args) {
		String s = "abc";
		subsequence(s, "");
		subsequence2(s, "");
		System.out.println(al);
		
	}

}
