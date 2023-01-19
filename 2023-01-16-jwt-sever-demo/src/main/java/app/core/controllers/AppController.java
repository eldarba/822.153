package app.core.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/app")
public class AppController {

	@GetMapping(headers = { HttpHeaders.AUTHORIZATION })
	public String greet() {
		return "Hello";
	}

	@GetMapping
	public String getCoupons() {
		return "Here are you coupons";
	}

}