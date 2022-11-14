package app.core.facades;

import org.springframework.stereotype.Component;

@Component
public class CompanyFacade {

	public int addCoupon() {

		if (Math.random() < 0.8) {
			System.out.println("coupon added");
			return (int) (Math.random() * 101);
		} else {
			throw new RuntimeException("addCoupon failed");
		}
	}

	public void removeCoupon(int id) {
		System.out.println("coupon " + id + " removed");
	}

}
