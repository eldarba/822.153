package app.core;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
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
		System.out.println("=== start test add new entry word");

		List<ExampleSentence> exampleSentences = new ArrayList<>();

		exampleSentences.add(new ExampleSentence(0, "that cat climbed the tree", null));
		exampleSentences.add(new ExampleSentence(0, "that cat drank milk", null));

		EntryWord word = new EntryWord(0, "Cat", "a nice animal that do meow", exampleSentences);

		EntryWord entryWord = dictionary.addWordToDictionary(word);

		int expectedEntryWordId = 1;
		int actualEntryWordId = entryWord.getId();
		Assertions.assertEquals(expectedEntryWordId, actualEntryWordId, "the first id should be 1");

		System.out.println("=== start test add existing entry word");
		DictionaryException e = Assertions.assertThrows(DictionaryException.class,
				() -> dictionary.addWordToDictionary(entryWord));
		System.out.println(e);

	}

}
