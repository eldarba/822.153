package c.points;

public class PointTest {

	public static void main(String[] args) {

		// create 3 Point objects
		Point p1 = new Point(3, 7); // (3, 7)
		Point p2 = new Point(5); // (5, 5)
		Point p3 = new Point(); // (0, 0)

		// use the objects by activating methods
		p1.print();
		p2.print();
		p3.print();

		System.out.println("===============");
		p1.moveRight();
		p2.moveUp();
		p2.print();

	}

}
