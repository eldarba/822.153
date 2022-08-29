package a;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Orange[] oranges = new Orange[100];

		for (int i = 0; i < oranges.length; i++) {
			// create an orange with random size
			int size = (int) (Math.random() * 3) + 3;
			Orange orange = new Orange(size);
			// put the orange object in the orange array
			oranges[i] = orange;
		}

		// print
		System.out.println(Arrays.toString(oranges));
		System.out.println("===============");

		// create 3 orange arrays per size
		Orange[] smallOranges = new Orange[100];
		Orange[] mediumOranges = new Orange[100];
		Orange[] bigOranges = new Orange[100];

		// sort oranges to proper array
		int s = 0, m = 0, b = 0;
		for (int i = 0; i < oranges.length; i++) {
			Orange orange = oranges[i];
			if (orange.getSize() == 3) {
				smallOranges[s++] = orange;
			} else if (orange.getSize() == 4) {
				mediumOranges[m++] = orange;
			} else {
				bigOranges[b++] = orange;
			}
		}

		// print the arrays
		System.out.println(Arrays.toString(smallOranges));
		System.out.println(Arrays.toString(mediumOranges));
		System.out.println(Arrays.toString(bigOranges));
	}

}
