package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Address;
import app.core.entities.Company;

// @Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 1");

		EntityManager em = factory.createEntityManager();

		try {
			em.getTransaction().begin();
			// create a company object with address
			Address address = new Address(0, "Israel", "Tel Aviv", "Alenbi", 12);
			Company company = new Company(0, "Telma", null);
			company.setAddress(address);
			// save the company
			em.persist(company);
			// end the transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();

		}

	}

}
