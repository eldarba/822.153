package b;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Tar3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 25; i++) {
			int r = (int) (Math.random() * 10);
			list.add(r);
		}
		
		System.out.println(list);
		
		// convert the List to Set
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println(set);

	}

}
