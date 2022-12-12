package app.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Book;
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
	public Library addLibrary(Library library) throws LibraryException {

		if (libraryRepository.existsByName(library.getName())) {
			throw new LibraryException("library name " + library.getName() + " already exists");
		}

		if (libraryRepository.existsById(library.getId())) {
			throw new LibraryException("library id " + library.getId() + " already exists");
		}

		library = libraryRepository.save(library);
		return library;

	}

	public void addBookToLibrary(Book book, int libraryId) throws LibraryException {
		Library library = libraryRepository.findById(libraryId)
				.orElseThrow(() -> new LibraryException("addBookToLibrary failed - library not found"));
		if (libraryRepository.existsByIdAndBooksTitle(libraryId, book.getTitle())) {
			throw new LibraryException("addBookToLibrary failed - this library already has this book title");
		}
		library.addBook(book);

	}

	public Library findLibrary(int libraryId) throws LibraryException {
		return libraryRepository.findById(libraryId)
				.orElseThrow(() -> new LibraryException("findLibrary failed - not found"));
	}

	public Book findBook(int bookId) throws LibraryException {
		return bookRepository.findById(bookId).orElseThrow(() -> new LibraryException("findBook failed - not found"));
	}

	public List<Book> getAllBooks() {
		return this.bookRepository.findAll();
	}

	public List<Book> getAllBooks(int libraryId) {
		return this.bookRepository.findByLibraryId(libraryId);
	}

}
