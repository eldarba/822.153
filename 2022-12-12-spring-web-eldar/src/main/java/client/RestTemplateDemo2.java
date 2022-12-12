package client;

import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class RestTemplateDemo2 {

	public static void main(String[] args) {

		// we need an object for making http request/response

		RestTemplate rt = new RestTemplate(); // an object for http request/response

		// set request url
		String url = "http://localhost:8080/api/cars";

		Car car = new Car(306, "Silver", "Audi");
		Car createdCar = rt.postForObject(url, car, Car.class);
		System.out.println(createdCar);

	}

}
