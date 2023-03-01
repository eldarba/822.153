package a;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable {

	private CountDownLatch latch;

	public Decrementer(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {

		try {
			System.out.println("latch count: " + this.latch.getCount() + ": " + Thread.currentThread().getName()); // 3

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("latch count: " + this.latch.getCount() + ": " + Thread.currentThread().getName()); // 2

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("latch count: " + this.latch.getCount() + ": " + Thread.currentThread().getName()); // 1

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("latch count: " + this.latch.getCount() + ": " + Thread.currentThread().getName()); // 0

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
