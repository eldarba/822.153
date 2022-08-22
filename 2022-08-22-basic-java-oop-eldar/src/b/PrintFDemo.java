package b;

public class PrintFDemo {

	public static void main(String[] args) {

		// regular expressions are string patterns starting with %
		// %n - new line
		int a = 5; // %d - integer
		double b = 6.32; // %f or %1.2f
		String name = "Dan"; // %s

		System.out.printf("a = %d%nb = %1.2f%n%s%n", a, b, name);

		System.out.printf("|%10d|%n", 5);
		System.out.printf("|%-10d|%n", 5);
		System.out.printf("|%10.2f|%n", 5.32);
		System.out.printf("|%-10.2f|%n", 5.32);

	}

}
