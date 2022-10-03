package b;

public class App1 {

	public static void main(String[] args) throws InterruptedException {

		SleepingThread t1 = new SleepingThread("t1");
		System.out.println("state: " + t1.getState());
		
		t1.start();
		System.out.println("state: " + t1.getState());

		Thread.sleep(500); // make main sleep for half a second
		System.out.println("state: " + t1.getState());

		t1.join(); // make main stop until t1 is terminated
		System.out.println("state: " + t1.getState());
	}

}
