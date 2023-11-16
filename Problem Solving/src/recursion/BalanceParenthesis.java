package recursion;

public class BalanceParenthesis {
	
	static void printBalParenthesis(char[] arr, int n, int i, int o, int c) {
		if(i == arr.length) {
			System.out.println(arr);
		}
		
		if(o < n) {
			arr[i] = '(';
			printBalParenthesis(arr, n, i+1, o+1, c);
		}
		
		if(c < o) {
			arr[i] = ')';
			printBalParenthesis(arr, n, i+1, o, c+1);
		}
	}

	public static void main(String[] args) {
		
		int n = 2;
		char[] arr = new char[n*2];
		printBalParenthesis(arr, n, 0, 0, 0);
		System.out.println();
		
		n = 3;
		char[] arr2 = new char[n*2];
		printBalParenthesis(arr2, n, 0, 0, 0);
	}

}
