package app.core;

import app.core.data.Person;

public class Main {

	public static void main(String[] args) {
		
		PersonController controller = new PersonController();
		
		Person p = new Person();
		p.setId(101);
		p.setName("Dan");
		p.setAge(25);
		
		controller.addPerson(p);
		
		Person p2 = new Person();
		p2.setId(102);
		p2.setName("Meir");
		p2.setAge(36);
		controller.addPerson(p2);
		
		controller.save();
		
		System.out.println("end");

	}

}
