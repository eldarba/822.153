package app.core;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Company;
import app.core.entities.Employee;
import app.core.repos.CompanyRepo;

@Component
public class Test3 implements CommandLineRunner {

	@Autowired
	private CompanyRepo companyRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 3");

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("Enter company id: ");
			int companyId = scanner.nextInt();

			Optional<Company> opt = companyRepo.findById(companyId);
			if (opt.isPresent()) {
				Company company = opt.get();
				System.out.println(company);
				System.out.println(company.getEmployees());
				// delete a company (cascade remove all employees)
				company.addEmployee(new Employee(0, "Yoav", 23));
				companyRepo.delete(company);

			} else {
				System.out.println("company not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
