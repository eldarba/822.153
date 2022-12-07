package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Person;
import app.core.repos.PersonRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	public String hello() {
		return "Hello";
	}

	public Person addPerson(Person person) {
		if (!personRepo.existsById(person.getId())) {
			person = personRepo.save(person);
			return person;
		} else {
			throw new RuntimeException("addPerson failed - already exists");
		}
	}

	public Person getPerson(int id) {
		return this.personRepo.findById(id).orElseThrow(() -> new RuntimeException("person not found"));
	}

}
