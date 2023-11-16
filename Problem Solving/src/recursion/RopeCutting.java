package recursion;

public class RopeCutting {
	
	static int maxPieces(int n, int a, int b, int c) {
		if(n == 0) {
			return 0;
		}else if(n < 0) {
			return -1;
		}
		
		int temp1 = maxPieces(n-a, a, b, c);
		int temp2 = maxPieces(n-b, a, b, c);
		int temp3 = maxPieces(n-c, a, b, c);
		
		int pieces = Math.max(temp1, Math.max(temp2, temp3));
		
		if(pieces == -1) {
			return -1;
		}
		
		return pieces+1;
		
	}

	public static void main(String[] args) {
		System.out.println(maxPieces(15, 5, 7, 8));

	}

}
