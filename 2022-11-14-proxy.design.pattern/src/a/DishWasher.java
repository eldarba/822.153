package a;

public class DishWasher implements DishWasherInerface {

	@Override
	public void wash() {
		System.out.println("start washing");
	}

	@Override
	public void turnOn() {
		System.out.println("dish washer on");
	}

	@Override
	public void turnOff() {
		System.out.println("dish washer off");
	}

}
