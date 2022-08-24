package b;

public class Shape {

	private String color;

	public Shape(String color) {
		super(); // invoke another CTOR in the super class
		this.color = color; // access class field
	}

	public Shape() {
		this("BLACK"); // invoke another CTOR in this class
	}

	public String getColor() {
		return this.color;
	}

}
