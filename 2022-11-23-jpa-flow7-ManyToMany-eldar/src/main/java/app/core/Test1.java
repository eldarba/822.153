package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.repos.CouponRepo;
import app.core.repos.CustomerRepo;

// @Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private CouponRepo couponRepo;
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 1");
		try {
			// create coupons and customers
			Coupon coupon1 = new Coupon(0, "aaa", 5, null);
			Coupon coupon2 = new Coupon(0, "bbb", 5, null);
			Coupon coupon3 = new Coupon(0, "ccc", 5, null);
			Coupon coupon4 = new Coupon(0, "eee", 5, null);

			Customer customer1 = new Customer(0, "Meir", 22, null);
			Customer customer2 = new Customer(0, "Yoni", 33, null);

			couponRepo.save(coupon1);
			couponRepo.save(coupon2);
			couponRepo.save(coupon3);
			couponRepo.save(coupon4);

			customerRepo.save(customer1);
			customerRepo.save(customer2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
