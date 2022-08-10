package e.cars;

public class PointTest {

	public static void main(String[] args) {
		// create a Point object
		Point p = new Point();
		// print location
		System.out.println("(" + p.x + ", " + p.y + ")");
		// move
		p.moveRight();
		p.moveRight();
		p.moveRight();
		p.moveUp();
		p.moveUp();
		p.moveUp();
		p.moveUp();
		p.moveUp();
		// print location
		System.out.println("(" + p.x + ", " + p.y + ")");
	}

}
