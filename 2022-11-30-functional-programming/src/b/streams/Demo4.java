package b.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(101, "Avi", 25));
		list.add(new Person(102, "Lea", 17));
		list.add(new Person(103, "Yona", 52));
		list.add(new Person(104, "Dor", 98));
		list.add(new Person(105, "Michael", 14));
		list.add(new Person(106, "Yehudit", 45));
		System.out.println(list);

		list.stream().peek(p -> {
			if (p.getAge() < 18) {
				p.setName(p.getName() + " Junior");
			} else {
				p.setName(p.getName() + " Senior");
			}
		}).forEach(p -> {
		});
		System.out.println(list);

	}

}
