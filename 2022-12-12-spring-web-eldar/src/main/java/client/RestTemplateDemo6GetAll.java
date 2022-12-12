package client;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Car;

public class RestTemplateDemo6GetAll {

	public static void main(String[] args) {

		// we need an object for making http request/response

		RestTemplate rt = new RestTemplate(); // an object for http request/response

		// set request url
		String url = "http://localhost:8080/api/cars";

		try {
			Car[] array = rt.getForObject(url, Car[].class);
			List<Car> list = Arrays.asList(array);
			System.out.println(list);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
