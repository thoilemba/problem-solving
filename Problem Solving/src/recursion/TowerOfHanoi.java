package recursion;

public class TowerOfHanoi {
	
	static void towerOfHanoi(int n, char src, char aux, char dest) {
		if(n == 1) {
			System.out.println(src +" -> "+ dest);
			return;
		}
		
		towerOfHanoi(n-1, src, dest, aux);
		towerOfHanoi(1, src, aux, dest);
		towerOfHanoi(n-1, aux, src, dest);
	}

	public static void main(String[] args) {

		towerOfHanoi(3, 'A', 'B', 'C');

	}

}
