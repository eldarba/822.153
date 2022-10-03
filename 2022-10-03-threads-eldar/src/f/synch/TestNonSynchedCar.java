package f.synch;

public class TestNonSynchedCar {

	public static void main(String[] args) {
		
		CarNonSynch car = new CarNonSynch(111);
		
		DriverNonSyncedCar moshe = new DriverNonSyncedCar("Moshe", 150, car);
		DriverNonSyncedCar lea = new DriverNonSyncedCar("Lea", 40, car);
		
		moshe.start();
		lea.start();

	}

}
