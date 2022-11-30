package b.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Demo9 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(Arrays.asList(3, 5, 7));

		Optional<Integer> opt = set.stream().findAny();

		if (opt.isPresent()) {
			System.out.println(opt.get());
		} else {
			System.out.println("NONE");
		}

	}

}
