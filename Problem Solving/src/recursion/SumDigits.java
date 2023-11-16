package recursion;

public class SumDigits {
	
	public static int sumDigits(int n) {
		if(n == 0) {
			return 0;
		}
		
		return sumDigits(n/10)+(n%10);
	}

	public static void main(String[] args) {
		System.out.println(sumDigits(12345));
	}

}
