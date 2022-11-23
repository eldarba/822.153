package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.services.AppServcie;

@Component
public class Test2 implements CommandLineRunner {

	@Autowired
	private AppServcie appServcie;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 2");
		try {
			appServcie.purchaseCoupon(1, 4);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
