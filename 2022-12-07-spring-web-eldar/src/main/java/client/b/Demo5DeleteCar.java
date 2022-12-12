package client.b;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class Demo5DeleteCar {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		URI uri = URI.create("http://localhost:8080/api/cars?number=999");
		RequestEntity<Void> req = RequestEntity.delete(uri).build();
		try {
			ResponseEntity<String> res = rt.exchange(req, String.class);
			System.out.println("================");
			System.out.println(res.getStatusCode());
			String msg = res.getBody();
			System.out.println(msg);
		} catch (RestClientException e) {
			System.out.println("================");
			System.out.println("Error: " + e.getMessage());
		}

	}

}
