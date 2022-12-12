package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Library;
import app.core.exceptions.LibraryException;
import app.core.repositories.BookRepository;
import app.core.repositories.LibraryRepository;
import app.core.repositories.ReaderRepository;

@Service
@Transactional
public class LibraryService {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private LibraryRepository libraryRepository;
	@Autowired
	private ReaderRepository readerRepository;

	/**
	 * adds a library
	 * 
	 * @param library the library to add
	 * @throws LibraryException if a library by this name already exists
	 */
	public void addLibrary(Library library) throws LibraryException {

		if (libraryRepository.existsByName(library.getName())) {
			throw new LibraryException("library name " + library.getName() + " already exists");
		}

		if (libraryRepository.existsById(library.getId())) {
			throw new LibraryException("library id " + library.getId() + " already exists");
		}

		libraryRepository.save(library);

	}

}
