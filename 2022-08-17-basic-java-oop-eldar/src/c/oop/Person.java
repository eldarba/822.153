package c.oop;

public class Person {

	// attributes - define the object set of data
	private int id;
	private String name;
	private int age;

	public void print() {
		System.out.println("Person [id=" + id + ", name=" + name + ", age=" + age + "]");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >= 0) {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 25) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

}
