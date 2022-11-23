package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

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

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();

		}

	}

}
