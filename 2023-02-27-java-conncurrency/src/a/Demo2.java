package a;

import java.util.concurrent.TimeUnit;

public class Demo2 {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable(); // tell the thread what to do

		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");

		t1.start();
		t2.start();

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
			try {
				// Thread.sleep(500);
				TimeUnit.SECONDS.sleep(1);
				// TimeUnit.SECONDS.sleep((long) (Math.random() * 3) + 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
