package app.core;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.core.entities.EntryWord;
import app.core.entities.ExampleSentence;
import app.core.exceptions.DictionaryException;
import app.core.services.DictionaryService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DictionaryDrillWebApplicationTests {

	@Autowired
	private DictionaryService dictionary;

	@Test
	@Order(1)
	void testAddEntryWord() throws DictionaryException {
		System.out.println("=== start test add new entry word");

		List<ExampleSentence> exampleSentences = new ArrayList<>();

		exampleSentences.add(new ExampleSentence(0, "that cat climbed the tree", null));
		exampleSentences.add(new ExampleSentence(0, "that cat drank milk", null));

		EntryWord word = new EntryWord(0, "Cat", "a nice animal that do meow", exampleSentences);

		word.addExampleSentence(new ExampleSentence(0, "the cat is sleeping", null));

		EntryWord entryWord = dictionary.addWordToDictionary(word);
		int expectedEntryWordId = 1;
		int actualEntryWordId = entryWord.getId();
		Assertions.assertEquals(expectedEntryWordId, actualEntryWordId, "the first id should be 1");

		System.out.println("=== start test add existing entry word");
		DictionaryException e = Assertions.assertThrows(DictionaryException.class,
				() -> dictionary.addWordToDictionary(entryWord));
		System.out.println(e);
	}

	@Test
	@Order(2)
	void testFindEntryWord() throws DictionaryException {
		System.out.println("=== test find existing entry word");
		EntryWord entryWord = this.dictionary.getEntryWordById(1);
		System.out.println("found: " + entryWord);
		Assertions.assertNotNull(entryWord);
		Assertions.assertEquals("Cat", entryWord.getWord());
		System.out.println("=== test find non existing entry word");
		DictionaryException e = Assertions.assertThrows(DictionaryException.class,
				() -> this.dictionary.getEntryWordById(10));
		System.out.println(e);
	}

	@Test
	@Order(3)
	void testDeleteEntryWord() throws DictionaryException {
		System.out.println("=== test deleting existing entry word");
		this.dictionary.deleteEntryWordById(1);
		System.out.println("=== test deleting non existing entry word");
		Exception e = Assertions.assertThrows(DictionaryException.class, () -> this.dictionary.deleteEntryWordById(1));
		System.out.println(e);
	}

}
