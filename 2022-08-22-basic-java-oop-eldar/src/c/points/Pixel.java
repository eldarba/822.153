package c.points;

public class Pixel extends Point {

	private String color;

	public Pixel(int x, int y, String color) {
		super(x, y); // call ctor of super class - Point
		this.color = color;
	}
}
