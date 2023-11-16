package recursion;

public class PowerOf {
	
	// time complexity - O(n)
	public static int powerOf(int x, int y) {
		
		if(y == 0) {
			return 1;
		}
		
		return x * powerOf(x, y-1);
	}
	
	// time complexity - O(log n)
	public static int powerOfEfficient(int x, int y) {
		
		if(y == 0) {
			return 1;
		}
		
		if(y%2 == 0) {
			int result =  powerOfEfficient(x, y/2);
			return result * result;
		}else {
			return x * powerOf(x, y-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(powerOf(2, 5));
		System.out.println(powerOf(5, 8));
		System.out.println(powerOfEfficient(2, 5));
		System.out.println(powerOfEfficient(5, 8));

	}

}
