package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.exceptions.LibraryException;
import app.core.services.LibraryService;

@Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private LibraryService libraryService;

	@Override
	public void run(String... args) {

		Library library1 = Library.builder().name("AAA").address("Jerusalem").build();
		Library library2 = new Library(0, "BBB", "Tel Aviv", null);
		Library library3 = new Library(0, "BBB", "Haifa", null);

		try {
			library1 = libraryService.addLibrary(library1);
			library2 = libraryService.addLibrary(library2);
			library3 = libraryService.addLibrary(library3);
		} catch (LibraryException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// add book to library
		try {
			libraryService.addBookToLibrary(Book.builder().title("Java 1").author("Dan").build(), library1.getId());
			libraryService.addBookToLibrary(Book.builder().title("Java 1").author("Dan").build(), library2.getId());
			libraryService.addBookToLibrary(Book.builder().title("Java 1").author("Dan").build(), library2.getId());
		} catch (LibraryException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
