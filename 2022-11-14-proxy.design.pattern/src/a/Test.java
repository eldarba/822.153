package a;

public class Test {

	public static void main(String[] args) {

//		DishWasherInerface dishWasher = new DishWasher();
		DishWasherInerface dishWasher = new DishwasherLogProxy();

		dishWasher.turnOn();
		dishWasher.wash();
		dishWasher.wash();
		dishWasher.turnOff();
	}

}
