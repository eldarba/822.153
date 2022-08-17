package a.homework;

public class Lab8Tar2 {
	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and print all numbers each in the same line
	 */
	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 101);
			arr[i] = r;
			System.out.print(arr[i] + ", ");
		}

	}
}
