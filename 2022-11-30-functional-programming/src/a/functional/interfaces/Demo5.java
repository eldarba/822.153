package a.functional.interfaces;

import java.util.function.Supplier;

import lombok.Data;

public class Demo5 {

	public static void main(String[] args) {

		Supplier<Integer> randomizer = () -> (int) (Math.random() * 101);

		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());

		Supplier<Person> personSupplier = () -> {
			Person p = new Person();
			p.setAge(randomizer.get());
			String[] names = { "aaa", "bbb", "ccc", "ddd", "eee" };
			p.setName(names[randomizer.get() % names.length]);
			p.setId(id++);
			return p;
		};

		Person p1 = personSupplier.get();
		Person p2 = personSupplier.get();
		Person p3 = personSupplier.get();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

	static int id = 101;
} // end of Demo5 class

@Data
class Person {
	private int id;
	private String name;
	private int age;

}