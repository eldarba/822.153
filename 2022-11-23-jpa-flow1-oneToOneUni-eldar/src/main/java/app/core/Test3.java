package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Address;
import app.core.entities.Company;
import app.core.repos.CompanyRepo;

@Component
public class Test3 implements CommandLineRunner {

	@Autowired
	private CompanyRepo companyRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 3");

		try {
			// create a company object with address
			Address address = new Address(0, "Israel", "Ramat Gan", "Herzel", 40);
			Company company = new Company(0, "Elite", null);
			company.setAddress(address);
			companyRepo.save(company);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
