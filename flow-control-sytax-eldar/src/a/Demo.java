package a;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		// assign variables
		int x = 5;

		// if
		if (x == 5) {
			System.out.println("FIVE");
		}

		// loop - while
		while (x > 0) {
			System.out.println(x);
			x--;
		}

		System.out.println("===============");

		// loop - for
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("===============");
		// arrays
		int[] arr = new int[10];
		System.out.println(arr.length);
		arr[0] = 100;
		arr[1] = 200;
		arr[3] = 300;

		// arrays copy
		int[] arr2 = new int[3];
		System.arraycopy(arr, 0, arr2, 0, 3);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
