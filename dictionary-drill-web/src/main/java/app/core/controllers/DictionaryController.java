package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.EntryWord;
import app.core.entities.ExampleSentence;
import app.core.exceptions.DictionaryException;
import app.core.services.DictionaryService;

@RestController
@RequestMapping("/api/dictionary")
public class DictionaryController {

	@Autowired
	private DictionaryService dictionaryService;

	@PostMapping("/add-entry")
	public EntryWord addWordToDictionary(@RequestBody EntryWord entryWord) {
		try {
			return this.dictionaryService.addWordToDictionary(entryWord);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@GetMapping("/entry-word")
	public EntryWord getEntryWordById(@RequestParam int entrywordId) {
		try {
			return this.dictionaryService.getEntryWordById(entrywordId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/examples/{entryWordId}")
	public List<ExampleSentence> getExamplesForEntryWord(@PathVariable int entryWordId) {
		return this.dictionaryService.getExamplesForEntryWord(entryWordId);
	}

	@PutMapping
	public EntryWord updateEntryWord(@RequestBody EntryWord entryWord) {
		try {
			return this.dictionaryService.updateEntryWord(entryWord);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping
	public void deleteEntryWordById(int entryWordId) {
		try {
			this.dictionaryService.deleteEntryWordById(entryWordId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
