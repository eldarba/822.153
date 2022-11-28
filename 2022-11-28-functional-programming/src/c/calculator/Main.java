package c.calculator;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// long syntax
		Calculator c1 = (a, b) -> {
			double res = a / b;
			return res;
		};

		System.out.println(c1.divide(100, 25));

		// short syntax
		Calculator c2 = (x, y) -> x / y;
		System.out.println(c2.divide(6, 2));

		List<Integer> list = Arrays.asList(2, 4, 6);
		System.out.println(list);

	}

}
