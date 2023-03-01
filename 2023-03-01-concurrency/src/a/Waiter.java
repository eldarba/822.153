package a;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable {

	private CountDownLatch latch;

	public Waiter(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {

		try {
			System.out.println(Thread.currentThread().getName() + " starting...");
			System.out.println(Thread.currentThread().getName() + " awaits...");
			this.latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " is now released and ready to go on");

	}

}
