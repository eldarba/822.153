package b.streams;

import java.util.Arrays;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 18, 4, 3, 2, 4, 5, 5, 4);

		boolean x = list.stream().anyMatch(e -> e == 18);

		System.out.println(x);
	}

}
