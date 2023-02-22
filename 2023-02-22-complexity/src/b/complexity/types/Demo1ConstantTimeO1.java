package b.complexity.types;

public class Demo1ConstantTimeO1 {

	public static void main(String[] args) {

		int[] arr = new int[1000];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}

		// finding element in an array complexity is O1
		int x = arr[0];
		int y = arr[937];

	}

}
