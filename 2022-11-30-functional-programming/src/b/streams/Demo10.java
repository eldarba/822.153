package b.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo10 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(Arrays.asList(3, 4, 5));

		// optional has functional programming methods
		Integer x = set.stream().findAny().orElseGet(() -> null);
		System.out.println(x);

	}

}
