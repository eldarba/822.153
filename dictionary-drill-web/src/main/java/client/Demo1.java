package client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.EntryWord;
import app.core.entities.ExampleSentence;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("=== CLIENT ===");

		RestTemplate rt = new RestTemplate();
		String baseUrl = "http://localhost:8080/api/dictionary";

		// post a request to the server to add EntryWord
		{
			List<ExampleSentence> exampleSentences = new ArrayList<>();
			exampleSentences.add(new ExampleSentence(0, "that cat climbed the tree", null));
			exampleSentences.add(new ExampleSentence(0, "that cat drank milk", null));
			EntryWord word = new EntryWord(0, "Cat", "a nice animal that do meow", null);
			word.setSentences(exampleSentences);

			System.out.println(word);
			System.out.println(word.getSentences());
			word = rt.postForObject(baseUrl + "/add-entry", word, EntryWord.class);
			System.out.println(word);
			System.out.println(word.getSentences());
		}

		{
			List<ExampleSentence> exampleSentences = new ArrayList<>();
			exampleSentences.add(new ExampleSentence(0, "that rabbit ran around the tree", null));
			exampleSentences.add(new ExampleSentence(0, "that rabbit ate carrot", null));
			EntryWord word = new EntryWord(0, "Rabbit", "a nice animal that do hops", null);
			word.setSentences(exampleSentences);

			System.out.println(word);
			System.out.println(word.getSentences());
			word = rt.postForObject(baseUrl + "/add-entry", word, EntryWord.class);
			System.out.println(word);
			System.out.println(word.getSentences());
		}
	}

}
