package a;

import java.util.Arrays;

public class Tar {

	public static void main(String[] args) {
		int length = 10;
		// 1. create arrays
		int[] nums1 = new int[length];
		int[] nums2 = new int[length];

		for (int i = 0; i < length; i++) {
			nums1[i] = (int) (Math.random() * 10);
			nums2[i] = (int) (Math.random() * 10);
		}

//		nums1 = new int[] { 1, 1, 9, 5, 3 };
//		nums2 = new int[] { 5, 1, 3, 6, 4 };

		// 2. print arrays
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));

		// 3. find the highest number
		int highest = 0;
		for (int digit = 1; digit <= 9; digit++) {
			int n = 0; // create a number from digit
			for (int i = 0; i < nums2.length; i++) {
				if (nums1[i] == digit) {
					n *= 10;
					n += digit;
				}
			}

			if (n > highest) {
				highest = n;
			}
		}
		System.out.println("highest is: " + highest);

		// 4.
		int[] ezer = new int[length];
		int ind = 0; // where to insert found elements
		for (int digit = 9; digit >= 0 && ind < 5; digit--) {
			for (int i = 0; i < length; i++) {
				if (nums1[i] == digit || nums2[i] == digit) {
					ezer[ind++] = digit;
					break;
				}
			}
		}

		// 5.
		System.out.println(Arrays.toString(ezer));

		// 6. highest 3 digit
		int max = ezer[0];
		int x = max * 100 + max * 10;
		System.out.println(x);

		int c = 0;
		for (int i = 0; i < length; i++) {
			if (nums1[i] == max) {
				c++;
			}
			if (nums2[i] == max) {
				c++;
			}
		}

		if (c >= 2) {
			x += max;
		} else {
			x += ezer[1];
		}

		System.out.println("highest 3 digit: " + x);

		// 7. even numbers
		boolean found = false;
		int evenDigits = 0;
		for (int digit = 8; digit >= 0; digit -= 2) {
			for (int i = 0; i < nums1.length; i++) {
				if (nums1[i] == digit) {
					evenDigits *= 10;
					evenDigits += digit;
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("evens: " + evenDigits);
		} else {
			System.out.println("no even digits found in nums 1");
		}
		// 8. odd numbers
		found = false;
		int oddDigits = 0;
		for (int digit = 9; digit >= 1; digit -= 2) {
			for (int i = 0; i < nums2.length; i++) {
				if (nums2[i] == digit) {
					oddDigits *= 10;
					oddDigits += digit;
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("odds: " + oddDigits);
		} else {
			System.out.println("no odd digits found in nums2");
		}

	}

}
