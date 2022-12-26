package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.EntryWord;
import app.core.exceptions.DictionaryException;
import app.core.repositories.EntryWordRepository;
import app.core.repositories.ExampleSentenceRepository;

@Service
@Transactional
public class Dictionary {

	@Autowired
	private EntryWordRepository entryWordRepository;
	@Autowired
	private ExampleSentenceRepository exampleSentenceRepository;

	public EntryWord addWordToDictionary(EntryWord entryWord) throws DictionaryException {
		if (this.entryWordRepository.existsById(entryWord.getId())) {
			throw new DictionaryException(
					"addWordToDictionary failed - a word with this id already exists: " + entryWord.getId());
		} else {
			return this.entryWordRepository.save(entryWord);
		}
	}

	public EntryWord getEntryWordById(int entrywordId) throws DictionaryException {
		return this.entryWordRepository.findById(entrywordId)
				.orElseThrow(() -> new DictionaryException("getEntryWordById faild - not found: " + entrywordId));
	}

	public EntryWord updateEntryWord(EntryWord entryWord) throws DictionaryException {
		if (this.entryWordRepository.existsById(entryWord.getId())) {
			return this.entryWordRepository.save(entryWord);
		}
		throw new DictionaryException("updateEntryWord failed - not found: " + entryWord.getId());
	}

	public void deleteEntryWordById(int entryWordId) throws DictionaryException {
		if (this.entryWordRepository.existsById(entryWordId)) {
			this.entryWordRepository.deleteById(entryWordId);
		} else {
			throw new DictionaryException("deleteEntryWordById failed - not found: " + entryWordId);
		}
	}

}
