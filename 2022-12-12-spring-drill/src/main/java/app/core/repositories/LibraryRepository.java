package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {

	Library findByBooksId(int bookId);

	boolean existsByName(String libraryName);

}
