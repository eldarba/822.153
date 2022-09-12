package b.shapes;

public class Circle extends Shape {
	
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + getColor() + "]";
	}

	
	

}
