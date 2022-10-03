package d;

import java.util.concurrent.TimeUnit;

public class CounterThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new ResetCounter();
		t.start();
		
		TimeUnit.SECONDS.sleep(3);
		t.interrupt();

		TimeUnit.SECONDS.sleep(5);
		t.interrupt();

	}

}
