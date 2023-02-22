package b.complexity.types;

import java.util.Arrays;

public class Demo3LiniarTime {

	static int c;

	/**
	 * find if an element exist in a any int array
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	static boolean findLiniarSearch(int[] arr, int x) {
		for (int e : arr) {
			c++;
			if (e == x)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}

		System.out.println(Arrays.toString(arr));
		boolean found = findLiniarSearch(arr, 12);
		System.out.println("found 12? " + found);
		System.out.println("iterations: " + c);

	}

}
