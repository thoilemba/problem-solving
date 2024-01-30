package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://neetcode.io/problems/insertionSort

class Pair {
	int key;
	String value;

	Pair(int key, String value) {
		this.key = key;
		this.value = value;
	}
}

public class InsertionSortProblem {

	public static List<List<Pair>> insertionSort(List<Pair> pairs) {

		// Implementation of Insertion Sort
		int n = pairs.size();
		List<List<Pair>> res = new ArrayList<>(); // To store the intermediate states of the array

		for (int i = 0; i < n; i++) {
			int j = i - 1;

			// Move elements that are greater than key one position ahead
			while (j >= 0 && pairs.get(j).key > pairs.get(j + 1).key) {
				Pair temp = pairs.get(j);
				pairs.set(j, pairs.get(j + 1));
				pairs.set(j + 1, temp);
				j--;
			}
			
			// Printing each states
//			for(Pair item : pairs) {
//            	System.out.print("("+ item.key +", "+ item.value+"),");
//          }
//			System.out.println();
			
			// Clone and save the entire state of the array at this point
			List<Pair> cloneList = new ArrayList<>(pairs);
			res.add(cloneList);
		}
		return res;
	}
	
	
	public static List<List<Pair>> insertionSort2(List<Pair> pairs) {
		
		// Implementation of Insertion Sort
		int n = pairs.size();
		List<List<Pair>> res = new ArrayList<>(); // To store the intermediate states of the array
		
		if(pairs.isEmpty()) {
			return res;
		}
		
		List<Pair> cloneList = new ArrayList<>(pairs);
		res.add(cloneList);

		for (int i = 1; i < n; i++) {
			
			int j = i - 1;
			
			int current = pairs.get(i).key;
			String value = pairs.get(i).value;
			// Move elements that are greater than key one position ahead
			while (j >= 0 && pairs.get(j).key > current) {
				pairs.set(j+1, new Pair(pairs.get(j).key, pairs.get(j).value));
				j--;
			}
			
			pairs.set(j+1, new Pair(current, value));
			
			// Printing each states
//			for(Pair item : pairs) {
//            	System.out.print("("+ item.key +", "+ item.value+"),");
//          }
//			System.out.println();
			
			res.add(new ArrayList<>(pairs));
		}
		return res;
	}

	public static void main(String[] args) {
		
        ArrayList<Pair> myList = new ArrayList<>();
        myList.add(new Pair(5, "apple"));
        myList.add(new Pair(2, "banana"));
        myList.add(new Pair(9, "cherry"));
		
//        List<List<Pair>> result = insertionSort(myList);
		List<List<Pair>> result = insertionSort2(myList);
		
		for (List<Pair> item : result) {
			System.out.print("[");
            for(Pair i : item) {
            	System.out.print("("+ i.key +", "+ i.value+"),");
            }
            System.out.print("]");
            System.out.println();
        }

	}
}
