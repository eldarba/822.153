package b.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

	}

}
