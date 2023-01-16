package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simple")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
//@CrossOrigin
public class SimpleController {

	@GetMapping
	public int random() {
		return (int) (Math.random() * 101);
	}
}
