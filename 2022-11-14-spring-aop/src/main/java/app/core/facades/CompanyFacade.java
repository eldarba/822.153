package app.core.facades;

import org.springframework.stereotype.Component;

@Component
public class CompanyFacade {
	
	public void addCoupon() {
		System.out.println("coupon added");
	}
	
	public void removeCoupon(int id) {
		System.out.println("coupon " + id + " removed");
	}

} 
