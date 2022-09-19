package c.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("ccc");
		list.add(5);
		list.add(3.8);
		list.add(new Scanner(System.in));
		System.out.println(list);
		// cast
		String str = (String) list.get(0);

		List<String> listOfString = new ArrayList<>();
		listOfString.add("aaa");
//		listOfString.add(4); // error
		listOfString.add("bbb");
		
		str = listOfString.get(0);
		
		System.out.println(listOfString);

	}

}
