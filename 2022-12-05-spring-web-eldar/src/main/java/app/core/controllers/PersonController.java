package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import app.core.services.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	public String hello() {
		String result = personService.hello();
		return result;
	}

}
