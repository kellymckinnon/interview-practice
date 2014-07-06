import java.util.*;
/* Implement mergesort, a divide and conquer algorithm 
that sorts in worst case O(n log n) time. */

public class Mergesort {
	public static void mergesort(int[] array) {
		if (array.length < 2) return;

		int size = array.length/2;
		int[] left = new int[size];
		int[] right = new int[array.length - size];

		//FIXME: possible to combine these loops?
		//There is a max difference of 1 between
		//left.size and right.size (for odd lengths)
		for (int i = 0; i < left.length; i++)
			left[i] = array[i];
		for (int i = 0; i < right.length; i++)
			right[i] = array[i+size];

		mergesort(left);
		mergesort(right);

		merge(array, left, right);
	}

	public static void merge(int[] result, int[] left, int[] right) {
	`	int leftIndex = 0; //Index for left array
		int rightIndex = 0; //Index for right array

		for (int i = 0; i < result.length; i++) {
			if ((leftIndex < left.length && left[leftIndex] < right[rightIndex])
				|| (rightIndex >= right.length)) {
				result[i] = left[leftIndex];
				leftIndex++;
			}
			else {
				result[i] = right[rightIndex];
				rightIndex++;
			}
		}
	}

	public static void main(String[] args) {
        int[] list = {14, 32, 67, 3, 41, 58, 85};
        System.out.println("before: " + Arrays.toString(list));
        mergesort(list);
        System.out.println("after:  " + Arrays.toString(list));
    }
}