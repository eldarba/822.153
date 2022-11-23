package app.core;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Student;
import app.core.entities.University;
import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;

@Component
public class Test3 implements CommandLineRunner {

	@Autowired
	private UniversityRepo universityRepo;
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 3");

		try {

			Optional<Student> optStd = studentRepo.findById(1);
			Optional<University> optUniv = universityRepo.findById(1);
			if (optStd.isPresent() && optUniv.isPresent()) {
				Student student = optStd.get();
				University university = optUniv.get();

				student.setUniversity(university);

				studentRepo.save(student);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
