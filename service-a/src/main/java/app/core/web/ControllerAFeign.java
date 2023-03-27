package app.core.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import app.core.web.feign.ServiceBFeignClient;

@RestController
public class ControllerAFeign {

	@Autowired
	private ServiceBFeignClient feignClient;

	// http://localhost:8001/service/a
	@HystrixCommand(fallbackMethod = "handleAFallbackFain")
	@GetMapping("/service/a/feign")
	public String handleAFeign() {

		// use the feign client implementation to call service-b
		// this looks just like any method but it makes an HTTP request
		String responseOfServiceB = feignClient.callServiceB();

		return "service a: " + responseOfServiceB;
	}

	public String handleAFallbackFain(Throwable t) {
		return "service a fallback feign: cant reach service b. cause: " + t;
	}

}
