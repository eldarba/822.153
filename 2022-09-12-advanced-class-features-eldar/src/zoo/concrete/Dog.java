package zoo.concrete;

import zoo.Mammal;
import zoo.interfaces.AdvancedFlyer;

public class Dog extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("woof");
	}

	@Override
	public void fly() {
		System.out.println("fly like a flying dog");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a dog");
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a flying dog");
	}

	@Override
	public void land() {
		System.out.println("land like a flying dog");
	}

}
