package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.facades.CompanyFacade;

public class App2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			CompanyFacade companyFacade = ctx.getBean(CompanyFacade.class);

			int count = companyFacade.addCoupon(); // calling a business method

			System.out.println(count); // print what the business method returned
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}

	}

}
