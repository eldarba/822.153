package a.homework;

import java.util.Arrays;

public class Lab9Tar3 {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and sum of all even numbers
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum of even numbers = " + sum);

	}

}
