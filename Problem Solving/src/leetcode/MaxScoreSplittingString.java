package leetcode;


/*
 Given a string s of zeros and ones, return the maximum score after splitting the string
 into two non-empty substrings (i.e. left substring and right substring).
 The score after splitting a string is the number of zeros in the left substring plus the
 number of ones in the right substring.

Example 1:
Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3

Example 2:
Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5

*/

public class MaxScoreSplittingString {
	
	static int maxScore(String s) {
		int maxScore = 0, zeroCount = 0, oneCount = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				oneCount++;
			}
		}
		
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == '0') {
				zeroCount++;
			}
			
			if(s.charAt(i) == '1') {
				oneCount--;
			}
			
			if(zeroCount + oneCount > maxScore) {
				maxScore = zeroCount + oneCount;
			}
		}
		
		return maxScore;
	}
	
	static int maxScore2(String s) {
		int maxScore = 0, zeroCount = 0, oneCount = 0, totalOne = 0, currentScore = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				totalOne++;
			}
		}
		
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == '0') {
				zeroCount++;
			}
			
			if(s.charAt(i) == '1') {
				oneCount++;
			}
			
			// Calculate the current score and update the maximum score if needed
			currentScore = zeroCount + totalOne - oneCount;
			
			if(currentScore > maxScore) {
				maxScore = currentScore;
			}
		}
		
		return maxScore;
	}

	public static void main(String[] args) {
		System.out.println(maxScore("00111"));
		System.out.println(maxScore2("00111"));

	}

}
