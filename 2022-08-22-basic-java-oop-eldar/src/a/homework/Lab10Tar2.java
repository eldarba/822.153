package a.homework;

import java.util.Arrays;

public class Lab10Tar2 {

	/*
	 * Create a class that eliminates duplicates. The class should be capable of
	 * getting an array with duplicate values and return an array of unique values
	 * generated from it. For example, for the input {1,2,5,1,6,1,5,4,8} the result
	 * should be {1,2,5,6,4,8}
	 */
	public static void main(String[] args) {

		int[] arr1 = { 2, 2, 5 };
		int[] arr2 = getUniqueArr(arr1);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	/**
	 * a method that get an array with possible duplicate elements and returns a
	 * unique array
	 * 
	 * @param arr an array with possible duplicate elements
	 * @return another array with the same elements withoute duplicates
	 */
	public static int[] getUniqueArr(int[] arr) {
		// create a new temporary array with the same length
		int[] temp = new int[arr.length];
		int length = 0; // set the length of the unique new array
		// iterate all elements
		for (int i = 0; i < arr.length; i++) {
			int candidate = arr[i]; // set candidate element as unique
			boolean unique = true; // set a boolean flag to know if candidate is unique
			// search the candidate in the unique array
			for (int j = 0; j < length; j++) {
				if (candidate == temp[j]) {
					// if we are here candidate is not unique
					unique = false; // change the flag
					break; // exit the inner loop
				}
			}
			if (unique) {
				// if we are here the candidate is unique and should move to the temp array
				temp[length++] = candidate;
			}
		}
		// done moving elements to temp array
		arr = new int[length]; // create a new array with the correct length
		System.arraycopy(temp, 0, arr, 0, length); // copy all elements to the correct length array
		return arr; // return the unique array
	}

}
