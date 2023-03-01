package a;

import java.util.concurrent.CountDownLatch;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		int count = 9;
		CountDownLatch latch = new CountDownLatch(count);

		Thread decrementer1 = new Thread(new Decrementer(latch), "d-1");
		Thread decrementer2 = new Thread(new Decrementer(latch), "d-2");
		Thread decrementer3 = new Thread(new Decrementer(latch), "d-3");

		Thread waiter1 = new Thread(new Waiter(latch), "waiter-1");
		Thread waiter2 = new Thread(new Waiter(latch), "waiter-2");

		waiter1.start();
		waiter2.start();

		Thread.sleep(5000);
		decrementer1.start();

		Thread.sleep(2000);
		decrementer2.start();
		decrementer3.start();

	}

}
