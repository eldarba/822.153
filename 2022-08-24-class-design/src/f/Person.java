package f;

import java.util.Objects;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return id % 100;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		// check if the parameter obj is of type Person
//		if (!(obj instanceof Person)) {
//			return false; // return false if obj is not a Person
//		}
//		// if we are here obj is Person - we want to check id
//		Person other = (Person) obj; // cast obj to Person so we can access id field
//		return this.id == other.id; // return true if same id, otherwise return false
//	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return id == other.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
