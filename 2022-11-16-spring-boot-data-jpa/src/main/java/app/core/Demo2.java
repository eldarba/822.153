package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.entities.Book;

@Component
@Order(2)
public class Demo2 implements CommandLineRunner {

	@Autowired
	private ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=============================================");
		System.out.println("=============================================");
		System.out.println("Demo 2 started ==============================");

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		// session
		EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin(); // transaction start
			Book book = em.find(Book.class, 103);
			System.out.println(book);
			book.setPrice(25);
			em.getTransaction().commit(); // transaction end - success
		} catch (Exception e) {
			em.getTransaction().rollback(); // transaction end - fail
			e.printStackTrace();
		}
	}

}
