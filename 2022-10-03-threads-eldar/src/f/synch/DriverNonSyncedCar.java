package f.synch;

public class DriverNonSyncedCar extends Thread {

	private int distance;
	private CarNonSynch car;

	public DriverNonSyncedCar(String driverName, int distance, CarNonSynch car) {
		super(driverName);
		this.distance = distance;
		this.car = car;
	}
	
	@Override
	public void run() {
		synchronized (car) {
			this.car.drive(distance);
		}
	}

}
