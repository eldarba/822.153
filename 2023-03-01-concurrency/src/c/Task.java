package c;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

	private CyclicBarrier barrier1;
	private CyclicBarrier barrier2;

	public Task(CyclicBarrier barrier1, CyclicBarrier barrier2) {
		super();
		this.barrier1 = barrier1;
		this.barrier2 = barrier2;
	}

	@Override
	public void run() {

		try {
			System.out.println(Thread.currentThread().getName() + " started");

			TimeUnit.SECONDS.sleep((long) (Math.random() * 6) + 1);
			System.out.println(Thread.currentThread().getName() + " waiting at barier 1");
			barrier1.await();

			TimeUnit.SECONDS.sleep((long) (Math.random() * 6) + 1);
			System.out.println(Thread.currentThread().getName() + " waiting at barier 2");
			barrier2.await();

			// reuse a barrier - therefore cyclic
			TimeUnit.SECONDS.sleep((long) (Math.random() * 6) + 1);
			System.out.println(Thread.currentThread().getName() + " waiting at barier 1");
			barrier1.await();

		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}
