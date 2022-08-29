package fruites;

public class Orange extends Fruit {

	public Orange(int size) {
		super(size); // calling other ctor in super class
	}

	@Override
	public String toString() {
		return "Orange -" + getSize();
	}

}
