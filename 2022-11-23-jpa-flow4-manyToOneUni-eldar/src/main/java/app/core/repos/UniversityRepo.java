package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.University;

public interface UniversityRepo extends JpaRepository<University, Integer> {

}
