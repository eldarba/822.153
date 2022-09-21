package b;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();

		while (set.size() < 10) {
			int r = (int) (Math.random() * 11);
			set.add(r);
		}

		System.out.println(set);

	}

}
