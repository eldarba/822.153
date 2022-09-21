package a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // not ordered
//		Set<String> set = new LinkedHashSet<>(); // ordered
//		Set<String> set = new TreeSet<>(); // sorted

		set.add("CCC");
		set.add("AAAAAAAA");
		set.add("BBB");

		System.out.println(set);

//		set.get(0);

		// get an Iterator of a collection
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String curr = it.next();
			System.out.println(curr);
			if (curr.length() > 3) {
				it.remove();
			}
		}

		System.out.println(set);

		// check length of id example
		int id = 236589;
		Integer idObj = id;
		System.out.println(idObj.toString().length());

	}
}