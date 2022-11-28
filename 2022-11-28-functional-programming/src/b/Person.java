package b;

public class Person {

	public void speak() {
		System.out.println("bla");
	}

	public static void main(String[] args) {
		// create person
		Person p1 = new Person();
		p1.speak();

		// create person
		// overriding the speak method
		Person p2 = new Person() {
			@Override
			public void speak() {
				System.out.println("lalala");
			}
		};

		p2.speak();

	}

}
