package app.core.facades;

import org.springframework.stereotype.Component;

@Component
public class CustomerFacade {

	public void buyCoupon(int id) {
		System.out.println("coupon " + id + " bought");
	}

	public void useCoupon(int id) {
		System.out.println("coupon " + id + " used");
	}

}  
