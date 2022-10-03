package d;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		CounterNoSleep t1 = new CounterNoSleep();
		t1.start();

		Thread.sleep(1);
		t1.interrupt();

	}

}
