package f.synch;

public class Driver extends Thread {

	private int distance;
	private Car car;

	public Driver(String driverName, int distance, Car car) {
		super(driverName);
		this.distance = distance;
		this.car = car;
	}
	
	@Override
	public void run() {
		this.car.drive2(distance);
	}

}
