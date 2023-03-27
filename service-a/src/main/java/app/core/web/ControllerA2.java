package app.core.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ControllerA2 {

	@Autowired
	private RestTemplate rt;

	// http://localhost:8001/service/a
	@HystrixCommand(fallbackMethod = "handleAFallback", commandKey = "ControllerA2.handleA2")
	@GetMapping("/service/a2")
	public String handleA() {
		String url = "http://service-b/service/b";
		String responseOfServiceB = rt.getForObject(url, String.class);
		return "service a2: " + responseOfServiceB;
	}

	public String handleAFallback(Throwable t) {
		return "service a2 fallback: cant reach service b. cause: " + t;
	}

}
