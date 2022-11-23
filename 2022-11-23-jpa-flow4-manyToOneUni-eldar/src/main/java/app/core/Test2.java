package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.University;
import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;

// @Component
public class Test2 implements CommandLineRunner {

	@Autowired
	private UniversityRepo universityRepo;
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 2");

		try {
			University u1 = new University(0, "Harvard");
			University u2 = new University(0, "Technion");

			universityRepo.save(u1);
			universityRepo.save(u2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
