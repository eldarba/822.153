package client.b;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class Demo1GetOneCar {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		URI uri = URI.create("http://localhost:8080/api/cars/102");
//		RequestEntity<Void> req = new RequestEntity<>(HttpMethod.GET, uri);
		RequestEntity<Void> req = RequestEntity.get(uri).build();
		try {
			ResponseEntity<Car> res = rt.exchange(req, Car.class);
			System.out.println("================");
			System.out.println(res.getStatusCode());
			Car car = res.getBody();
			System.out.println(car);
		} catch (RestClientException e) {
			System.out.println("================");
			System.out.println("Error: " + e.getMessage());
		}

	}

}
