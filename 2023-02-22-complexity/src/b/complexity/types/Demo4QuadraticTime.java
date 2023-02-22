package b.complexity.types;

import java.util.Arrays;

public class Demo4QuadraticTime {

	static double c;

	static void bubleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				c++;
				int e1 = arr[j];
				int e2 = arr[j + 1];
				if (e1 > e2) {
					arr[j] = e2;
					arr[j + 1] = e1;
				}
			}
		}
	}

	public static void main(String[] args) {

		int input = 100_000;

		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10000);
		}

		System.out.println(Arrays.toString(arr));

		bubleSort(arr);

		System.out.println(Arrays.toString(arr));

		System.out.println("itterations " + c);

	}

}
