package b.arrays;

public class Demo2 {

	public static void main(String[] args) {

		// create the array
		int[] arr = new int[25];
		// initialize sum variable
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			// create a random number
			int r = (int) (Math.random() * 101);
			arr[i] = r; // insert the number to the array
			// print the array element at the current index
			System.out.println(arr[i]);
			sum += arr[i]; // add current element to sum
		}
		
		// print the calculated sum
		System.out.println("sum = " + sum);

	}

}
