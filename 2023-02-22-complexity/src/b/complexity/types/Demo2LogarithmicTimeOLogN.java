package b.complexity.types;

import java.util.Arrays;

public class Demo2LogarithmicTimeOLogN {
	static int c = 0;

	/**
	 * find if an element exist in a sorted int array
	 * 
	 * @param arr must be sorted
	 * @param x
	 * @return
	 */
	static boolean findBinarySearch(int[] arr, int x) {
		int indMin = 0;
		int indMax = arr.length - 1;
		int indMid = (indMax - indMin) / 2;
		int midVal = arr[indMid];

		while (indMin < indMax) {
			c++;
			if (midVal == x)
				return true;
			if (x < midVal) {
				indMax = indMid - 1;
			} else {
				indMin = indMid + 1;
			}
			indMid = (indMax - indMin) / 2 + indMin;
			midVal = arr[indMid];
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000);
		}

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
		boolean found = findBinarySearch(arr, 12);
		System.out.println("found 12? " + found);
		System.out.println("iterations: " + c);

		{
//			Set<Integer> set = new TreeSet<>();
//			set.add(5);
//			set.add(100);
//			set.add(65);
//			set.add(0);
//			set.add(3);
//			System.out.println(set);
//
//			// the complexity for finding element in a sorted structure is O(log n)
//			boolean x = set.contains(65);
//
//			System.out.println("found? " + x);
		}

	}

}
