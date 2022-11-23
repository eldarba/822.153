package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;

@Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private UniversityRepo universityRepo;
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 1");

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
