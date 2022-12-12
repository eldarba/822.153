package client;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class RestTemplateDemo3 {

	public static void main(String[] args) {

		// we need an object for making http request/response

		RestTemplate rt = new RestTemplate(); // an object for http request/response

		// set request url
		String url = "http://localhost:8080/api/cars/101";

		try {
			Car car = rt.getForObject(url, Car.class);
			System.out.println(car);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
