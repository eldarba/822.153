package cars;

public class Highway {

	private String name;
	private Car[] cars = new Car[10];
	private int i; // initialized automatically to 0

	public Highway(String name) {
		super();
		this.name = name;
	}

	public void addCar(Car car) {
		cars[i++] = car;
	}

	public Car[] getCars() {
		return cars;
	}
	
	

}
