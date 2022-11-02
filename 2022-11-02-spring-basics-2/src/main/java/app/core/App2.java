package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.cars.Car;

public class App2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)) {
			
			Car car = ctx.getBean(Car.class);
			System.out.println("max speed = " + car.getMaxSpeed());
			
			car.start();
			System.out.println("=======");
			car.drive();
			System.out.println("=======");
			car.stop();
			System.out.println("=======");

		}

	}

}
