package app.core.web.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b") // define a base URI IP:PORT
public interface ServiceBFeignClient {

	@GetMapping("/service/b") // define a route
	String callServiceB();

}
