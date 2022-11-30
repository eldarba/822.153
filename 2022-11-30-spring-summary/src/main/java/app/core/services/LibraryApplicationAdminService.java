package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.entities.Reader;
import app.core.exceptions.LibraryException;
import app.core.repos.AddressRepo;
import app.core.repos.BookRepo;
import app.core.repos.LibraryRepo;
import app.core.repos.ReaderRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibraryApplicationAdminService {

	private BookRepo bookRepo;
	private AddressRepo addressRepo;
	private LibraryRepo libraryRepo;
	private ReaderRepo readerRepo;

	@Autowired
	public LibraryApplicationAdminService(BookRepo bookRepo, AddressRepo addressRepo, LibraryRepo libraryRepo,
			ReaderRepo readerRepo) {
		super();
		this.bookRepo = bookRepo;
		this.addressRepo = addressRepo;
		this.libraryRepo = libraryRepo;
		this.readerRepo = readerRepo;
	}

	public Library addLibrary(Library library) {
		if (!libraryRepo.existsById(library.getId())) {
			return libraryRepo.save(library);
		} else {
			throw new RuntimeException("addLibrary faild - already exists");
		}
	}

	public void addBookToLibrary(int libraryId, Book book) {
		Library library = libraryRepo.findById(libraryId).orElseThrow();
		library.addBook(book);
	}

	public Reader addReader(Reader reader) {
		if (!readerRepo.existsById(reader.getId())) {
			return readerRepo.save(reader);
		} else {
			throw new RuntimeException("addReader faild - already exists");
		}
	}

	public void borrow(int readerId, int bookId) {
		Reader reader = readerRepo.findById(readerId)
				.orElseThrow(() -> new LibraryException("borrow faild - reader not found"));
		Book book = bookRepo.findById(bookId).orElseThrow(() -> new LibraryException("borrow faild - book not found"));
		reader.addBook(book);
	}

}
