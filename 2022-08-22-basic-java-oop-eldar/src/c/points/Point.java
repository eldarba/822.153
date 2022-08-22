// package declaration
package c.points;

// class declaration
public class Point {

	// attributes definition
	private int x;
	private int y;

	// constructors are used on object creation
	// CTOR 1
	public Point(int x, int y) {
		this.x = x; // assign the x parameter value to the attribute x
		this.y = y;
	}

	// CTOR 2
	public Point(int val) {
		this.x = val;
		this.y = val;
	}

	// CTOR 3
	public Point() {

	}

	// methods are use on existing objects
	public void moveRight() {
		x++;
	}

	public void moveUp() {
		y++;
	}

	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}

}
