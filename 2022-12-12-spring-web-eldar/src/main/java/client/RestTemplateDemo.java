package client;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class RestTemplateDemo {

	public static void main(String[] args) {

		// we need an object for making http request/response

		RestTemplate rt = new RestTemplate(); // an object for http request/response

		// set request url
		String url = "http://localhost:8080/api/cars";

		// make a RequestEntity object
		RequestEntity<Car> request = RequestEntity.post(url).body(new Car(404, "White", "Opel"));

		// use the RestTemplate.exchange to send a request and get a response
		// send the request and get the response
		ResponseEntity<Car> response = rt.exchange(request, Car.class);

		// get the response body as a car object
		Car createdCar = response.getBody();
		System.out.println(createdCar);

		// get the response status code
		System.out.println(response.getStatusCodeValue());
		System.out.println(response.getStatusCode());

	}

}
