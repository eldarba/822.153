package b.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// get a stream from the list
		Stream<String> stream = list.stream();

		// add a listener and get a new stream
		stream = stream.map(str -> str.toUpperCase());

		// add a terminal operation - starts the stream processing
		stream.forEach(System.out::println);

	}

}
