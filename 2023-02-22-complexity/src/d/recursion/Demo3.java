package d.recursion;

public class Demo3 {

	static void printAtoB(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}

	static void printAtoBRecursive(int a, int b) {
		// base case a == b
		if (a == b) {
			System.out.println(a);
		} else {
			System.out.println(a);
			printAtoBRecursive(a + 1, b);
		}
	}

	public static void main(String[] args) {
		printAtoBRecursive(20, 26);
	}

}
