package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Customer;

public interface StudentRepo extends JpaRepository<Customer, Integer> {

}
