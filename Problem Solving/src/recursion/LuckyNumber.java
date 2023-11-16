package recursion;

public class LuckyNumber {
	
	static boolean isLuckyNumber(int n, int counter) {
		
		if(n%counter == 0) {
			return false;
		}
		
		if(n < counter) {
			return true;
		}
		
		return isLuckyNumber(n-(n/counter), counter+1);
	}

	public static void main(String[] args) {
		
		System.out.println(isLuckyNumber(13, 2));
		System.out.println(isLuckyNumber(25, 2));
	}

}
