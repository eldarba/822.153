package b.shapes;

// concrete class - must implement all 
// inherited abstract method 
public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(String color, int length, int width) {
		super(color); // call a super class ctor
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + getColor() + "]";
	}

	

}
