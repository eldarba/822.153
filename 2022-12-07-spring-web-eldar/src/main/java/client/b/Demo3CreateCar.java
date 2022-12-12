package client.b;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class Demo3CreateCar {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		URI uri = URI.create("http://localhost:8080/api/cars");
		Car car = new Car(999, "Silver", "AUDI");
		RequestEntity<Car> req = RequestEntity.post(uri).body(car);
		try {
			ResponseEntity<Car> res = rt.exchange(req, Car.class);
			System.out.println("================");
			System.out.println(res.getStatusCode());
			Car createdCar = res.getBody();
			System.out.println(createdCar);
		} catch (RestClientException e) {
			System.out.println("================");
			System.out.println("Error: " + e.getMessage());
		}

	}

}
