package a.homework;

public class Lab8Tar6 {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and prints the maximum number and its index in the array
	 */
	public static void main(String[] args) {
		

		int[] arr = new int[10];
		int max = 0;
		int maxInd = 0;

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 101);
			arr[i] = r;
			System.out.print(arr[i] + ", ");
			
			if(arr[i] > max) {
				max = arr[i];
				maxInd = i;
			}
		}
		System.out.println();
		System.out.println("max is: " + max);
		System.out.println("max index is: " + maxInd);

	}

}
