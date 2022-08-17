package a.homework;

public class Lab5Tar6 {

	/*
	 * Create a class that defines a random value between 0-100,000 and prints if it
	 * is a palindrome (a symmetric number like: 12321, 666, 47974, 404 …)
	 */
	public static void main(String[] args) {

		int r = (int) (Math.random() * 100_001);
		 r = 8; // for testing
		int original = r;
		int rev = 0;

		while (r != 0) {
			rev *= 10;
			rev += r % 10;
			r /= 10;
		}

		System.out.println(original);
//		System.out.println(rev);

		if (original == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("NOT palindrome");
		}

	}

}
