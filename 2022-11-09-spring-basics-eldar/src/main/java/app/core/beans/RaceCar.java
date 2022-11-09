package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RaceCar implements Car {

	@Autowired
	@Qualifier("turboEngine")
	private Engine engine;
	private int maxSpeed = 210;

	@Override
	public void start() {
		engine.turnOn();
		System.out.println("race car started");

	}

	@Override
	public void drive(int speed) {
		if (speed <= maxSpeed) {
			System.out.println("race car driving at speed " + speed);
		} else {
			System.out.println("Too Fast. max speed is " + maxSpeed);
		}
	}

	@Override
	public void stop() {
		engine.turnOff();
		System.out.println("race car stopped");
	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;
	}

}
