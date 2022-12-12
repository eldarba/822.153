package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
			libraryService.addLibrary(library1);
			libraryService.addLibrary(library2);
			libraryService.addLibrary(library3);
		} catch (LibraryException e) {
			System.out.println(e.getMessage());
		}

	}

}
