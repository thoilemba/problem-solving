package string;

public class SubStrings {
	
	// Printing substrings by each size
	static void printAllSubString(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length()-i; j++) {
				for(int k = j; k <= i+j; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
	
	
	// Printing all the substrings first by including each current index
	static void printAllSubString2(String s) {
		
		for(int si = 0; si < s.length(); si++) {
			for(int ei = si; ei < s.length(); ei++) {
				for(int k = si; k <= ei; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		String s = "12345";
		printAllSubString(s);
		
		System.out.println();
		String s2 = "12345";
		printAllSubString2(s2);

	}

}


// 0 1 2 3 4
// h e l l o