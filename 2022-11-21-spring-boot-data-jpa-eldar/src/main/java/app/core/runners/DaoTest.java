package app.core.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.dao.StudentDao;
import app.core.entities.Student;
import app.core.entities.Student.Subject;

// @Component
public class DaoTest implements CommandLineRunner {

	@Autowired
	private StudentDao dao;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(0, "aaa", "aaa@mail", 25, LocalDate.of(2020, 1, 15), true, Subject.ENGLISH);
		dao.createStudent(student);

	}

}
