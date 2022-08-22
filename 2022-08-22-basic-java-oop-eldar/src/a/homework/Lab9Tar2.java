package a.homework;

public class Lab9Tar2 {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and print all odds numbers
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
