package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.facades.CompanyFacade;
import app.core.facades.CustomerFacade;
import app.core.security.LoginManager;

public class App3 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {

			CompanyFacade companyFacade = ctx.getBean(CompanyFacade.class);
			CustomerFacade customerFacade = ctx.getBean(CustomerFacade.class);
			LoginManager loginManager = ctx.getBean(LoginManager.class);

			loginManager.login("123");

			companyFacade.addCoupon();
			companyFacade.removeCoupon(109);
			customerFacade.buyCoupon(500);
			customerFacade.buyCoupon(500);
			customerFacade.useCoupon(500);
			customerFacade.useDiscount();
			customerFacade.buyCoupon(500);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
