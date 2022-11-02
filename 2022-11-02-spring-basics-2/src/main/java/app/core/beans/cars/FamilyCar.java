package app.core.beans.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FamilyCar implements Car {

	// DI - Dependency Injection - part of IoC
	@Autowired
	private Engine engine;
	
	@Value("${family.car.max.speed}")
	private int maxSpeed;

	@Override
	public void start() {
		engine.turnOn();
		System.out.println("FamilyCar started");
	}

	@Override
	public void drive() {
		System.out.println("FamilyCar driving");
	}

	@Override
	public void stop() {
		engine.turnOff();
		System.out.println("FamilyCar stopped");
	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	

}
