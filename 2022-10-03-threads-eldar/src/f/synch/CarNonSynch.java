package f.synch;

public class CarNonSynch {

	private int number;
	private int km;

	public CarNonSynch(int number) {
		super();
		this.number = number;
	}

	public void drive(int distance) {
		Thread driver = Thread.currentThread();
		System.out.println("car " + number + ": driver " + driver.getName() + " started at " + km + " for a distnce of "
				+ distance);
		this.km += distance;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("car " + number + ": driver " + driver.getName() + " ended at " + km);
	}

}
