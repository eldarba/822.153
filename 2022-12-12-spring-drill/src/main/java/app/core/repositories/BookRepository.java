package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByLibraryId(int libraryId);

	List<Book> findByReadersId(int readerId);

}
