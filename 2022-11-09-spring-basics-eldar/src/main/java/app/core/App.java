package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Car;

public class App {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)){
			Car car1 = ctx.getBean("familyCar", Car.class);
			car1.start();
			car1.drive(60);
			car1.stop();
			
			System.out.println("===========");

			Car car2 = ctx.getBean("raceCar", Car.class);
			car2.start();
			car2.drive(200);
			car2.stop();
	
			System.out.println("===========");
			
			Car car3 = ctx.getBean("sportsCar", Car.class);
			car3.start();
			car3.drive(70);
			car3.stop();
		}
	}

}
