package f.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {

		// tester for divide by seven
		Predicate<Integer> divideBySeven = x -> x % 7 == 0;

		// tester for number greater than 100
		Predicate<Integer> greaterThan100 = x -> x > 100;

		// tester for message not above 25 characters
		Predicate<String> upTo25 = msg -> msg.length() <= 25;

		// create a list with numbers
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(2, 4, 5, 6, 7, 8, 9));
		System.out.println(list);

		// remove all odd numbers
		list.removeIf(e -> e % 2 == 1);
		System.out.println(list);

	}

}
