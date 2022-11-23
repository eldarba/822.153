package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Coupon;

public interface UniversityRepo extends JpaRepository<Coupon, Integer> {

}
