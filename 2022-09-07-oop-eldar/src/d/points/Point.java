package d.points;

public class Point {

	private static int c;
	public static final int MIN = 0;
	public static final int MAX = 100;

	public final int index = ++c;
	private int x;
	private int y;
	private String name;

	{ // initializer - runs before CTOR - can be used to initialize fields
//		c++;
	}

	public Point() {
//		c++;
	}

	public Point(String name, int x, int y) {
		super();
//		c++;
		setX(x);
		setY(y);
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= MIN && x <= MAX) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= MIN && y <= MAX) {
			this.y = y;
		}
	}

	public static int getNumberOfPointsCreated() {
		return c;
	}

	@Override
	public String toString() {
		return "Point [index=" + index + ", name: " + name + ", x=" + x + ", y=" + y + "]";
	}

}
