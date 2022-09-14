package a.enums;

public class Car {

	public enum Make {
		BMW, FORD, SUBARU, MERCEDES, SUSITA, VOLKSWAGON, HONDA;
	}

	private Color color;
	private Make make;

	public Car(Color color, Make make) {
		super();
		this.color = color;
		this.make = make;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", make=" + make + "]";
	}

	public static void main(String[] args) {
		Car car = new Car(Color.GREEN, Make.HONDA);
		System.out.println(car);
	}

}
