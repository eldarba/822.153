package a.homework;

public class PersonTest {

	public static void main(String[] args) {
		
		// create a person object
		Person p = new Person();
		// set name
		p.name = "Eran";
		// print state
		System.out.println("id: " + p.id + ", name: " + p.name + ", age: " + p.age);
		p.setAgeToTwenty();
		System.out.println("id: " + p.id + ", name: " + p.name + ", age: " + p.age);
		p.growUpOneYear();
		System.out.println("id: " + p.id + ", name: " + p.name + ", age: " + p.age);

	}

}
