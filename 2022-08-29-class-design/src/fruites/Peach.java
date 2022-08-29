package fruites;

public class Peach extends Fruit {

	public Peach(int size) {
		super(size); // calling other ctor in super class
	}

	@Override
	public String toString() {
		return "Peach -" + getSize();
	}

}
