package recursion;

public class SubsetSum {
	
	static int subsetSum(int[] arr, int sum, int i) {
		
		if(sum == 0) {
			return 1;
		}
		if(sum < 0) {
			return 0;
		}
		if(i == arr.length) {
			return 0;
		}
		
		return subsetSum(arr, sum-arr[i], i+1) + subsetSum(arr, sum, i+1);
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = {10, 20, 5, 15};
		
		System.out.println(subsetSum(arr , 7, 0));
		System.out.println(subsetSum(arr2 , 25, 0));

	}

}

