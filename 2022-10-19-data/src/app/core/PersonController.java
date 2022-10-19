package app.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import app.core.data.Person;

public class PersonController {

	private List<Person> persons = new ArrayList<>();

	// CRUD operations

	// CREATE
	public void addPerson(Person person) {
		if (!persons.contains(person)) {
			persons.add(person);
		}
	}

	// READ
	public Person getPerson(int personId) {
		for (Person person : persons) {
			if (person.getId() == personId) {
				return person;
			}
		}
		return null;
	}

	// READ
	public List<Person> getAll() {
		return this.persons;
	}

	// UPDATE
	public void updatePerson(Person person) {
		for (Person curr : persons) {
			if (curr.getId() == person.getId()) {
				curr.setName(person.getName());
				curr.setAge(person.getAge());
				return;
			}
		}
	}

	// DELETE
	public void deletePerson(int personId) {
		Person person = new Person();
		person.setId(personId);
		persons.remove(person);

//		Iterator<Person> it = persons.iterator();
//		while (it.hasNext()) {
//			Person curr = it.next();
//			if (curr.getId() == personId) {
//				it.remove();
//				return;
//			}
//		}
	}

	public void save() {
		File file = new File("files/persons.data");
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(persons);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void load() {
		File file = new File("files/persons.data");
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			this.persons = (List<Person>) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
