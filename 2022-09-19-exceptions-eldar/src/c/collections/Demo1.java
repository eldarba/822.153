package c.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("ccc");
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list.size());
		System.out.println(list);
		

		Set set = new HashSet();
		set.add("ccc");
		set.add("aaa");
		set.add("bbb");
		set.add("aaa");
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
	}

}
