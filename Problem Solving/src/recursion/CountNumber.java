package recursion;

public class CountNumber {
	
	static public int countNumber(int n) {
		if(n == 0) {
			return 0;
		}
		
		return countNumber(n/10)+1;
	}

	public static void main(String[] args) {
		
		System.out.println(countNumber(12345));
		System.out.println(countNumber(-12));
	}

}
