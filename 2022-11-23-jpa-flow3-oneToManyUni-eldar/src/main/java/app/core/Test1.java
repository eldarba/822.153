package app.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Company;
import app.core.entities.Employee;
import app.core.repos.CompanyRepo;

//@Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private CompanyRepo companyRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 1");

		try {
			Company company1 = new Company(0, "Tadiran", null);
			Company company2 = new Company(0, "Amkor", null);

			Employee e1 = new Employee(0, "Dan", 25);
			Employee e2 = new Employee(0, "Lea", 32);
			Employee e3 = new Employee(0, "Nira", 18);
			Employee e4 = new Employee(0, "David", 25);
			Employee e5 = new Employee(0, "Adi", 25);

			List<Employee> comp1Emps = Arrays.asList(e1, e2, e3);
			List<Employee> comp2Emps = Arrays.asList(e4, e5);

			company1.setEmployees(comp1Emps);
			company2.setEmployees(comp2Emps);

			// save to database
			companyRepo.save(company1);
			companyRepo.save(company2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
