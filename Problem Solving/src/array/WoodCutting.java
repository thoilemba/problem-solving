package array;

public class WoodCutting {
	
	static int findWoodCount(int[] heights, int h) {
		int woodCount = 0;
		
		for(int i = 0; i < heights.length; i++) {
			if(heights[i] > h) {
				woodCount = woodCount + (heights[i]-h);
			}
		}
		
		return woodCount;
	}

	static int machineHeight(int[] heights, int b) {
		
		int max = 0;
		// finding the max height
		for(int i = 0; i < heights.length; i++) {
			if(heights[i] > max) {
				max = heights[i];
			}
		}
		
		int low = 0, high = max, mid = 0;
		
		while(low <= high) {
			mid = (low+high)/2;
			
			int woodCount = findWoodCount(heights, mid);
			
			if(woodCount == b || low == mid) {
				return mid;
			}else if(woodCount > b) {
				low = mid;
			}else {
				high = mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {20, 15, 10, 17};
		System.out.println(machineHeight(arr, 7));
		System.out.println(machineHeight(arr, 8));
	}
}
