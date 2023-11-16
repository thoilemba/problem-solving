package recursion;

public class PrintNumber {
	
	static int i = 1;
	
	static public void printNumber(int n) {
		if(i > n) {
			return;
		}
		
		System.out.println(i);
		i = i+1;
		printNumber(n);
		
	}	
	
	static public void printNumber2(int n) {
		if(n == 0) {
			return ;
		}
		printNumber2(n-1);
		System.out.println(n);
	}
	
	static public void printNumber3(int n) {
		if(n == 0) {
			return ;
		}
		System.out.println(n);
		printNumber2(n-1);
	}

	public static void main(String[] args) {
		printNumber(5);
		System.out.println();
		printNumber2(5);
		System.out.println();
		printNumber3(5);

	}

}
