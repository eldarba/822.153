package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
