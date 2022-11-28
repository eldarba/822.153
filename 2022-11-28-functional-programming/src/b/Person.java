package b;

public class Person {

	private int age;
	private String name;

	public Person() {
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
