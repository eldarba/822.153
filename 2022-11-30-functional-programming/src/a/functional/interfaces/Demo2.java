package a.functional.interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {

		// create a predicate for testing if a given integer divides by seven
		Predicate<Integer> divideBySeven = x -> x % 7 == 0;
		// test the created predicate object
		if (divideBySeven.test(14)) {
			System.out.println("divides by 7");
		} else {
			System.out.println("divides by 7 NOT");
		}

		// create a predicate for testing if a given integer is greater than 100
		Predicate<Integer> greaterThan100 = x -> x > 100;
		// test the created predicate object
		if (greaterThan100.test(14)) {
			System.out.println("greater than 100");
		} else {
			System.out.println("NOT greater than 100");
		}

		// create a predicate for testing if a given String is not over 25 characters
		Predicate<String> upTo25 = msg -> msg.length() <= 25;
		// test the created predicate object
		if (upTo25.test("aaaaaaaaaaaa")) {
			System.out.println("this string is ok - not longer than 25 characters");
		} else {
			System.out.println("this string is NOT ok - more than 25 characters");
		}

		// create a list with numbers
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 6, 7, 8, 9));
		System.out.println(list);

		// remove all odd numbers
		list.removeIf(e -> e % 2 == 1);
		System.out.println(list);

		LocalDate a18 = LocalDate.now().minusYears(18);
		System.out.println(a18);

		System.out.println("========================================");
		List<String> texts = new ArrayList<>();
		texts.add("aaabbbbbbbbbb");
		texts.add("xaabbbbbbbbbb");
		texts.add("aab");
		texts.add("ben");
		texts.add("aaabbbbbbbbbb");
		System.out.println(texts);

		texts.removeIf(str -> str.startsWith("a") && str.length() > 5);
		System.out.println(texts);

		System.out.println(-9); // unary operator
		System.out.println(10 - 9); // binary operator
		System.out.println(10 - 9 > 5 ? "yes" : "no"); // ternary operator

	}

}
