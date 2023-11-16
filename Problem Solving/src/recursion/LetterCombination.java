package recursion;

public class LetterCombination {
	
	static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	static void possibleWords(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		String key = keypad[s.charAt(0)-48];
		
		for(int i = 0; i<key.length(); i++) {
			possibleWords(s.substring(1), ans+key.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		String s = "846";
		possibleWords(s,"");

	}

}
