package app.core.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Student;
import app.core.services.AppService;

@Component
public class StudentServiceTest implements CommandLineRunner {

	@Autowired
	private AppService service;

	@Override
	public void run(String... args) throws Exception {

		List<Student> list = service.getAllStudents();
		System.out.println("==============================================");
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("==============================================");

	}

}
