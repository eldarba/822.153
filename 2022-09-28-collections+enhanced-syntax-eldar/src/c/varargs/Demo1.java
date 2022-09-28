package c.varargs;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String... args) {

		System.out.println(add(10, 30));
		System.out.println(add(10, 30, 5));
		System.out.println(add(10, 30, 5, 1, 2, 3, 4, 5));
		System.out.println(add("Eldar", 10, 30, 5, 1, 2, 3, 4, 5));

		List<Integer> list = Arrays.asList(2, 4, 6, 5, 3, 1, 3, 5);

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	// varargs method 1
	public static int add(int... values) {
		int sum = 0;
		for (int x : values) {
			sum += x;
		}
		return sum;
	}

	// varargs method 2
	public static int add(String userName, int... values) {
		System.out.println("Hello " + userName);
		int sum = 0;
		for (int x : values) {
			sum += x;
		}
		return sum;
	}

	public static void print(String... arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
