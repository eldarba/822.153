package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
