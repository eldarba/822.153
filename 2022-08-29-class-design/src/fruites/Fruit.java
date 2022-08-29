package fruites;

public class Fruit {

	// attribute
	private int size = 3;

	// CTOR
	public Fruit(int size) {
		super();
		setSize(size);
	}

	// methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size >= 3 && size <= 5) {
			this.size = size;
		}
	}

}
