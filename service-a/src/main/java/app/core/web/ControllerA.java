package app.core.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ControllerA {

	@Autowired
	private RestTemplate rt;

//	@Autowired
//	private DiscoveryClient discoveryClient;
//	
//	@Autowired
//	private LoadBalancerClient loadBalancerClient;

	// http://localhost:8001/service/a
	@HystrixCommand(fallbackMethod = "handleAFallback")
	@GetMapping("/service/a")
	public String handleA() {
//		String instanceId = "service-b";
//		URI serviceUri = getServiceUriLB(instanceId);
//		String requestPath = "/service/b";
//		String url = serviceUri + requestPath;
		String url = "http://service-b/service/b";
		String responseOfServiceB = rt.getForObject(url, String.class);
		return "service a: " + responseOfServiceB;
	}
	
	public String handleAFallback(Throwable t) {
		return "service a fallback: cant reach service b. cause: " + t;
	}

//	// without load balancer we always return the same instance
//	URI getServiceUri(String serviceId) {
//		List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
//		return instances.get(0).getUri();
//	}
//	
//	// with load balancer we can choose a different instance each time
//	URI getServiceUriLB(String serviceId) {
//		ServiceInstance serviceInstance = loadBalancerClient.choose(serviceId);
//		return serviceInstance.getUri();
//	}

}
