package recursion;

public class SumAllElements {
	
	// reducing the elements from last index to first index
	static int sumAllElements(int[] arr, int lastIndex){
		if(lastIndex < 0) {
			return 0;
		}
		
		return sumAllElements(arr, lastIndex-1) + arr[lastIndex];
	}
	
	// reducing the elements from first index to last index
	static int sumAllElements2(int[] arr, int index){
		if(index > arr.length-1) {
			return 0;
		}
		
		return sumAllElements2(arr, index+1) + arr[index];
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(sumAllElements(arr, arr.length-1));
		System.out.println(sumAllElements2(arr, 0));

	}

}
