package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.exceptions.LibraryException;
import app.core.services.LibraryService;

@RestController // define the Controller part of MVC
// http://localhost:8080/api/library
@RequestMapping("/api/library")
public class LibraryController {

	@Autowired // inject the Model part of MVC
	private LibraryService libraryService;

	@PostMapping
	public Library addLibrary(@RequestBody Library library) {
		try {
			return this.libraryService.addLibrary(library);
		} catch (LibraryException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	// http://localhost:8080/api/library/15
	@PostMapping("/add-book")
	public void addBookToLibrary(@RequestBody Book book, @RequestParam int libraryId) {
		try {
			this.libraryService.addBookToLibrary(book, libraryId);
		} catch (LibraryException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@GetMapping("/find-library/{libraryId}")
	public Library findLibrary(@PathVariable int libraryId) {
		try {
			return this.libraryService.findLibrary(libraryId);
		} catch (LibraryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("find-book")
	public Book findBook(@RequestParam(required = true) int bookId) {
		try {
			return this.libraryService.findBook(bookId);
		} catch (LibraryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("all-books")
	public List<Book> getAllBooks() {
		return this.libraryService.getAllBooks();
	}

	@GetMapping("all-library-books")
	public List<Book> getAllBooks(@RequestParam(required = true) int libraryId) {
		return this.libraryService.getAllBooks(libraryId);
	}

}
