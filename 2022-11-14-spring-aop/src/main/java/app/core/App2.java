package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.facades.CompanyFacade;

public class App2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		CompanyFacade companyFacade = ctx.getBean(CompanyFacade.class);

		int count = companyFacade.addCoupon();
		System.out.println(count);

		ctx.close();

	}

}
