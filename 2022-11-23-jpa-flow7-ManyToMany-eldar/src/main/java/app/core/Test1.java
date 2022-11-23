package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Customer;
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
		// create 2 universities and 5 students
		Customer st1 = new Customer(0, "Meir", 22, null);
		Customer st2 = new Customer(0, "Yoni", 33, null);
		Customer st3 = new Customer(0, "Tomer", 18, null);
		Customer st4 = new Customer(0, "Yafa", 26, null);
		Customer st5 = new Customer(0, "Yona", 19, null);

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
