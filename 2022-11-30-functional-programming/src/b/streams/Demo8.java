package b.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 6, 8, 9, 0, 2, 4, 8, 2, 4);

		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());

		System.out.println(list);
		System.out.println(distinct);

	}

}
