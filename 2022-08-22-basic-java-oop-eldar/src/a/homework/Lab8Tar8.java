package a.homework;

public class Lab8Tar8 {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and prints:
	 * 
	 * All numbers in same line
	 * 
	 * total sum
	 * 
	 * average
	 * 
	 * maximum value and its index in the array
	 * 
	 * minimum value and its index in the array
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		double sum = 0;
		int max = 0;
		int maxInd = 0;
		int min = 100;
		int minInd = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.print(arr[i] + ", ");
			sum += arr[i];
			if (arr[i] > max) {
				max = arr[i];
				maxInd = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				minInd = i;
			}
		}
		System.out.println();

		System.out.println("sum: " + sum);
		System.out.println("average: " + sum / arr.length);
		System.out.println("maximum: " + max + " at index: " + maxInd);
		System.out.println("minimum: " + min + " at index: " + minInd);

	}

}
