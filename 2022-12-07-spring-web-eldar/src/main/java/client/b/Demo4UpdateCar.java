package client.b;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class Demo4UpdateCar {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		URI uriGet = URI.create("http://localhost:8080/api/cars/999");
		RequestEntity<Void> reqGet = RequestEntity.get(uriGet).build();
		try {
			ResponseEntity<Car> res = rt.exchange(reqGet, Car.class);
			System.out.println("================");
			System.out.println(res.getStatusCode());
			Car retreiviedCar = res.getBody();
			System.out.println(retreiviedCar);
			retreiviedCar.setColor("Blue");
			System.out.println("updated to");
			URI uriUpdate = URI.create("http://localhost:8080/api/cars");
			RequestEntity<Car> reqUpdate = RequestEntity.put(uriUpdate).body(retreiviedCar);
			res = rt.exchange(reqUpdate, Car.class);
			System.out.println(res.getStatusCode());
			Car updatedCar = res.getBody();
			System.out.println(updatedCar);
		} catch (RestClientException e) {
			System.out.println("================");
			System.out.println("Error: " + e.getMessage());
		}

	}

}
