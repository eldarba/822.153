package c.oop;

public class PersonTest3 {

	public static void main(String[] args) {

		Person p1 = new Person();

		Person p2 = new Person(101, "aaa", 28);

		Person p3 = new Person(102);

		p1.print();
		p2.print();
		p3.print();

	}

}
