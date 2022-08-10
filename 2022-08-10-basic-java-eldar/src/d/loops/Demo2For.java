package d.loops;

public class Demo2For {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("===========");
		for (int i = 0; i <= 20; i += 2) {
			System.out.println(i);
		}

		// counter can be char
		System.out.println("===========");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " : " + (int) c);
		}

		// we can have many counters
		System.out.println("===========");
		for (int a = 1, b = 10; a <= 10 && b >= 1; a++, b--) {
			System.out.println(a + " - " + b);
		}

	}

}
