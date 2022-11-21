package app.core.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Student;
import app.core.entities.Student.Subject;
import app.core.repositories.StudentRepository;

//@Component
public class StudentRepositoryTest implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(0, "bbb", "bbb@mail", 40, LocalDate.of(2019, 5, 15), false, Subject.PHYSICS);
		student = repo.save(student);
		System.out.println(student);
	}

}
