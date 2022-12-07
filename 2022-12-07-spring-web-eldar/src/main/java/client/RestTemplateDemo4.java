package client;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class RestTemplateDemo4 {

	public static void main(String[] args) {

		// we need an object for making http request/response

		RestTemplate rt = new RestTemplate(); // an object for http request/response

		// set request url
		String url = "http://localhost:8080/api/cars";

		try {
			Car car = new Car(101, "Red", "Audi");
			rt.put(url, car);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
