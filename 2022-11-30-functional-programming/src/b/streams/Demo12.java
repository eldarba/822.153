package b.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo12 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(Arrays.asList(100, 3, 4, 5, 9));
		System.out.println(set);

		Integer[] arr = set

				.stream()

				.map(e -> e * 2)

				.toArray((size) -> new Integer[size]);

		System.out.println(Arrays.toString(arr));

	}

}
