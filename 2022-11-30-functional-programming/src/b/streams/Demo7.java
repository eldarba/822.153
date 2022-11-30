package b.streams;

import java.util.Arrays;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 6, 18, 9, 0, 2, 4, 8, 2, 4);

		boolean x = list.stream().allMatch(e -> e % 2 == 0);

		System.out.println(x);
	}

}
