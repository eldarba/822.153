package b;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(22, "ccc");
		Person p2 = new Person(11, "bbb");
		Person p3 = new Person(33, "aaa");

		List<Person> list = Arrays.asList(p1, p2, p3);
		System.out.println(list);

		// sort by name
		list.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));
		System.out.println(list);

		// sort by age
		list.sort((person1, person2) -> person1.getAge() - person2.getAge());
		System.out.println(list);

	}

}
