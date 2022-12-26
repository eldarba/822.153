package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.ExampleSentence;

public interface ExampleSentenceRepository extends JpaRepository<ExampleSentence, Integer> {

	List<ExampleSentence> findByEntryWordId(int entryWordId);

}
