package f.synch;

public class Car {

	private int number;
	private int km;

	public Car(int number) {
		super();
		this.number = number;
	}

	// this method is a critical section
	// only 1 thread at a time can access this method
	public synchronized void drive(int distance) {
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

	public void drive2(int distance) {
		Thread driver = Thread.currentThread();
		System.out.println("car " + number + ": driver " + driver.getName());

		// critical section
		synchronized (this) {

			System.out.println("started at " + km + " for a distnce of " + distance);
			this.km += distance;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("car " + number + ": driver " + driver.getName() + " ended at " + km);
		}
	}

}
