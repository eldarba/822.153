package b;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width) {
		this("BLACK", length, width);
	}

	public Rectangle(int side) {
		this(side, side);
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
