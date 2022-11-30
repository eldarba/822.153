package b.streams;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 1, 4, 3, 2, 4, 5, 5, 4);

		list.stream().peek(e -> System.out.println("=== " + e)).distinct().forEach(System.out::println);
	}

}
