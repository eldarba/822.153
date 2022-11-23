package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Address;

@Component
public class Test2 implements CommandLineRunner {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 2");

		EntityManager em = factory.createEntityManager();

		try {
			em.getTransaction().begin();
			// get an address(and it's company)
			Address address = em.find(Address.class, 1);
			System.out.println(address);

			if (address != null) {
				System.out.println(address.getCompany());
			}

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();

		}

	}

}
