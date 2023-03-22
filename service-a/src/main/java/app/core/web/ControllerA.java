package app.core.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
	
	// http://localhost:8001/service/a
	@GetMapping("/service/a")
	public String handleA() {
		return "service a";
	}

}
