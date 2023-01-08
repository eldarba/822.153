package client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import app.core.entities.Entry;

public class Demo2RestTemplateGet {

	public static void main(String[] args) {
		System.out.println("=== CLIENT ===");

		RestTemplate rt = new RestTemplate();
		String baseUrl = "http://localhost:8080/api/dictionary";

		// GET request to fetch Entry
		{

			ResponseEntity<Entry> response = rt.getForEntity(baseUrl + "/entry?entryId=1", Entry.class);
			System.out.println(response.getStatusCode());

		}

	}

}
