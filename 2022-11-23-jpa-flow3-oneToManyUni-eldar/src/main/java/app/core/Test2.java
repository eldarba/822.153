package app.core;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Company;
import app.core.entities.Employee;
import app.core.repos.CompanyRepo;

// @Component
public class Test2 implements CommandLineRunner {

	@Autowired
	private CompanyRepo companyRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 2");

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("Enter company id: ");
			int companyId = scanner.nextInt();

			Optional<Company> opt = companyRepo.findById(companyId);
			if (opt.isPresent()) {
				Company company = opt.get();
				System.out.println(company);
				System.out.println(company.getEmployees());
				// add an employee to the company
				company.addEmployee(new Employee(0, "Yoav", 23));
				companyRepo.save(company);

			} else {
				System.out.println("company not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
