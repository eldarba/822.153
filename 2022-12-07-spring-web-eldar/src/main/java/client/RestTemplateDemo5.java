package client;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class RestTemplateDemo5 {

	public static void main(String[] args) {

		// we need an object for making http request/response

		RestTemplate rt = new RestTemplate(); // an object for http request/response

		// set request url
		String url = "http://localhost:8080/api/cars?number=102";

		try {
			rt.delete(url);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
