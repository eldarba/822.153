package a;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				int a = arr[j];
				int b = arr[j + 1];
				if (a > b) {
					arr[j] = b;
					arr[j + 1] = a;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
