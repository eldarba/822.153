package d.recursion;

public class Demo2 {

	static void printOneToVal(int val) {
		for (int i = 1; i <= val; i++) {
			System.out.println(i);
		}
	}

	static void printOneToValRecursive(int val) {
		// base case
		if (val == 1) {
			System.out.println(1);
			return;
		}

		// other cases
		printOneToValRecursive(val - 1);
		System.out.println(val);
	}

	public static void main(String[] args) {
		printOneToValRecursive(5);
	}

}
