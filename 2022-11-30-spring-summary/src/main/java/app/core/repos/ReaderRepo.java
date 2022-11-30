package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Reader;

public interface ReaderRepo extends JpaRepository<Reader, Integer> {

}
