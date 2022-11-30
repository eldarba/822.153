package b.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo11 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(Arrays.asList(100, 3, 4, 5, 9));

		int minimum = set.stream().min((a, b) -> a - b).get();
		System.out.println(minimum);

		int maximum = set.stream().max((a, b) -> a - b).get();
		System.out.println(maximum);

		int sum = set.stream().reduce((acu, e) -> acu += e).get();
		System.out.println(sum);

	}

}
