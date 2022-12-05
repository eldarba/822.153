package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
