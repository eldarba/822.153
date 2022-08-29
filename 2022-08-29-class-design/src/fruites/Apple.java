package fruites;

public class Apple extends Fruit {

	public Apple(int size) {
		super(size); // calling other ctor in super class
	}

	@Override
	public String toString() {
		return "Apple -" + getSize();
	}

}
