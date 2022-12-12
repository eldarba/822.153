package app.core.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	// http://localhost/api/greet?name=Eldar
	@GetMapping(path = "/greet", produces = MediaType.TEXT_HTML_VALUE) // set the content-type header to
	public String greet(String name) {
		return "Hello<br>" + name;
	}

	// http://localhost/api/add?a=15&b=25
	@GetMapping("/add")
	public double add(@RequestParam double a, @RequestParam double b) {
		return a + b;
	}

	// http://localhost/api/add/15/25
	@GetMapping("/add/{a}/{b}")
	public double add2(@PathVariable double a, @PathVariable double b) {
		return a + b;
	}

}
