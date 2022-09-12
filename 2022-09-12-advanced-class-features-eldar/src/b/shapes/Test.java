package b.shapes;

public class Test {
	
	public static void main(String[] args) {
		
		// create a Shape reference - pointing to an Object
		Shape shape = new Rectangle("Red", 100, 30);
		System.out.println(shape.getColor());
		System.out.println(shape.getArea());
		
		// to call Rectangle method - cast the reference to Rectangle
		((Rectangle)shape).setWidth(30);
		((Rectangle)shape).setWidth(22);
		
		Rectangle rectangle = (Rectangle) shape;
		rectangle.setWidth(25);
		rectangle.setLength(10);
		
		
		// an array of any shape would be of type Shape
		Shape[] shapes = new Shape[3];
	}
	
	// a method for printing the area of any shape will get Shape as parameter
	public static void printAnyShape(Shape shape) {
		System.out.println("area is: " + shape.getArea());
	}
	
}
