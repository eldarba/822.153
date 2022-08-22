package a.homework;

public class Lab5Tar1 {

	/*
	 * Create a class that defines a random number with value between 0-10,000 and
	 * print the length of digits: [1998 - 4]
	 */
	public static void main(String[] args) {
		int r = (int) (Math.random() * 10_001);
		System.out.println(r);

		int c = 1;
		while (r >= 10) {
			r /= 10;
			c++;
		}

		System.out.println(c + " digit");

	}

}
