package app.core;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

import app.core.entities.Book;

//@Component
@Order(1)
public class Demo1 implements CommandLineRunner {

	@Autowired
	private ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=============================================");
		System.out.println("=============================================");
		System.out.println("Demo 1 started ==============================");
		Book book = new Book();
		book.setId(103);
		book.setTitle("spring basics 3");
		book.setAuthor("Roz");
		book.setPublication(LocalDate.of(2010, 1, 25));
		book.setPrice(560);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		// session
		EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin(); // transaction start
			em.persist(book);
			em.getTransaction().commit(); // transaction end - success
		} catch (Exception e) {
			em.getTransaction().rollback(); // transaction end - fail
			e.printStackTrace();
		}
	}

}
