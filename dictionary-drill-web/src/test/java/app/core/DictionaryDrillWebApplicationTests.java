package app.core;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.core.entities.EntryWord;
import app.core.entities.ExampleSentence;
import app.core.exceptions.DictionaryException;
import app.core.services.Dictionary;

@SpringBootTest
class DictionaryDrillWebApplicationTests {

	@Autowired
	private Dictionary dictionary;

	@Test
	void testAddEntryWord() throws DictionaryException {
		System.out.println("=== start test add entry word");

		List<ExampleSentence> exampleSentences = new ArrayList<>();

		exampleSentences.add(new ExampleSentence(0, "that cat climbed the tree", null));
		exampleSentences.add(new ExampleSentence(0, "that cat drank milk", null));

		EntryWord word = new EntryWord(0, "Cat", "a nice animal that do meow", exampleSentences);

		dictionary.addWordToDictionary(word);
	}

}
