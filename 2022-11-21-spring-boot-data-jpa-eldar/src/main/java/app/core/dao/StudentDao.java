package app.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.entities.Student;

// @Component
public class StudentDao {

	@Autowired
	private EntityManagerFactory emFactory;

	public int createStudent(Student student) {
		EntityManager em = emFactory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(student);
			em.getTransaction().commit();
			return student.getId();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new RuntimeException("create student failed", e);
		}
	}

}
