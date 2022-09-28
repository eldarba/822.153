package b.sortingLists;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("bbb");
		list.add("aaa");
		list.add("cbaddd");
		list.add("hello");
		list.add("java");
		list.add("sorting");
		list.add("hello");
		list.add("aaaaa");
		System.out.println(list);
		
		list.sort(null);
		System.out.println(list);

		list.sort(new StringLengthComparator());
		System.out.println(list);

	}

}


