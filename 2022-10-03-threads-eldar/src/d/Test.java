package d;

import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Counter t1 = new Counter();
		t1.start();
		
		TimeUnit.SECONDS.sleep(5);
		// t1.stop();
		t1.interrupt();

	}

}
