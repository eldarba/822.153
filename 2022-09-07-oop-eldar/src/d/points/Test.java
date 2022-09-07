package d.points;

public class Test {

	public static void main(String[] args) {
		
		
		Point p1 = new Point("", 5, 9);
		Point p2 = new Point("", 33, 49);
		Point p3 = new Point("", 100, 0);
		Point p4 = new Point();
		Point p5 = new Point("", 1, 1);
		
		//p1 = null;
		
		System.out.println(p1); // prefer this
		System.out.println(p1.toString()); // on this - throws error when null
		
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
//		System.out.println(p5);

	}

}
