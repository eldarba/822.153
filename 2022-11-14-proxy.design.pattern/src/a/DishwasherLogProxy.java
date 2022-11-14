package a;

public class DishwasherLogProxy implements DishWasherInerface {

	private DishWasher dishWasher = new DishWasher();

	@Override
	public void turnOn() {
		dishWasher.turnOn();
	}

	@Override
	public void wash() {
		System.out.println(">>> proxy: about to wash");
		dishWasher.wash();
	}

	@Override
	public void turnOff() {
		dishWasher.turnOff();
	}

}
