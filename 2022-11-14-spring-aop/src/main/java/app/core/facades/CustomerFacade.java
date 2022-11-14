package app.core.facades;

import org.springframework.stereotype.Component;

import app.core.annotations.MyAnnotation;

@Component
public class CustomerFacade {

	public void buyCoupon(int id) {
		System.out.println("coupon " + id + " bought");
	}

	@MyAnnotation
	public void useCoupon(int id) {
		System.out.println("coupon " + id + " used");
	}

	public void useDiscount() {
		System.out.println("discount used");
	}

}
