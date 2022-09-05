package cars;

public class Test1Car {

	public static void main(String[] args) {
		// create an object
		Car car = new Car();
		// configure the object
		car.setNumber(111);
		car.setSpeed(40); 
		// use object's methods
		// print results
		System.out.println(car.getNumber());
		System.out.println(car.getSpeed());
		System.out.println(car);

	}

}
