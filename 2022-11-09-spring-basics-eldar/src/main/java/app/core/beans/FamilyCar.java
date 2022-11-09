package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FamilyCar implements Car {

	private Engine engine;
	@Value("${car.max.speed}")
	private int maxSpeed;
	
	@Autowired
	public FamilyCar(@Qualifier("basicEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void start() {
		engine.turnOn();
		System.out.println("family car started");
	}

	@Override
	public void drive(int speed) {
		if (speed <= maxSpeed) {
			System.out.println("family car is driving at speed " + speed);
		} else {
			System.out.println("Error - speed limit is " + maxSpeed);
		}
	}

	@Override
	public void stop() {
		System.out.println("family car stopped");
		engine.turnOff();
	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
