package a.homework;

public class Lab8Tar6Minimum {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and prints the maximum number and its index in the array
	 */
	public static void main(String[] args) {
		

		int[] arr = new int[10];
		int min = 100;
		int minInd = 0;

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 101);
			arr[i] = r;
			System.out.print(arr[i] + ", ");
			
			if(arr[i] < min) {
				min = arr[i];
				minInd = i;
			}
		}
		System.out.println();
		System.out.println("minimum is: " + min);
		System.out.println("minimum index is: " + minInd);

	}

}
