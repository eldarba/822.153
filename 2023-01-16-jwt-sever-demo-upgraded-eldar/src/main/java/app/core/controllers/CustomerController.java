package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION })
	public String getDetails() {
		return "this is customer details";
	}

}
