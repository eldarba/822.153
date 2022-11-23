package app.core.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	List<Student> findByName(String name);

	List<Student> findByUniversityId(int universityId);

}
