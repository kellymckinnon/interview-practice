/* PROBLEM: Implement a function to perform a binary search on a SORTED array of
integers to find the index of a given integer. */

public class BinarySearch {
	/* A binary search is basically "higher or lower" -- start at the center, if 
	the center > target, search the lower half, else search the uper half. This
	lends itself to a recursive implementation.
	Runtime efficiency: O(log(n)) */
	public static int binSearch(int[] arr, int lower, int upper, int target) {
		if (upper-lower == 0 && arr[lower] != target) { //Not found
			return -1;
		}

		int center = (upper - lower)/2;

		if (arr[center] == target) { // Match found
			return center;
		}
		else if (arr[center] > target) {
			return binSearch(arr, lower, center-1, target);
		}
		else return binSearch(arr, center+1, upper, target);

	}
	//Iterative version, eliminates overhead of recursion (it was only changing
	//the limits)
	public static int iterative(int[] arr, int lower, int upper, int target) {
		if (upper - lower == 0 && arr[lower] != target) return -1;
		
		while (true) {
			int center = (upper-lower)/2;
			if(arr[center] == target) return center;
			else if (arr[center] > target) {
				upper = center -1;
			}
			else lower = center+1;
		}
	}
}