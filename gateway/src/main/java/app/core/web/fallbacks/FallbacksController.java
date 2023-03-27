package app.core.web.fallbacks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbacksController {

	@GetMapping("/fallback/serviceA") // copy path from gateway yaml at GITHUB
	public String fallbackA() {
		return "Gateway Fallback: can't call service-a";
	}

	@GetMapping("/fallback/serviceB") // copy path from gateway yaml at GITHUB
	public String fallbackB() {
		return "Gateway Fallback: can't call service-b";
	}

}
