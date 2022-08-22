package a.homework;

import java.util.Arrays;

public class Lab10Tar3 {

	/*
	 * Create a class that reverses a given array order. For example, for the input
	 * {6,8,4,2,7,5} the result should be {5,7,2,4,8,6}. o create an array[10] of
	 * numbers with random values between 0-10 to be used as an input o print the
	 * array before and after reversing
	 */
	public static void main(String[] args) {

		int length = 7;

		int[] arr1 = new int[length];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = new int[arr1.length];
		for (int i = 0, j = arr1.length - 1; i < arr1.length; i++, j--) {
			arr2[j] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
	}

}
