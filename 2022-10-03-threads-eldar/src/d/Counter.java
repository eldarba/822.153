package d;

public class Counter extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("---");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// here we write the response to interrupt
				System.out.println("thred interrupted and will stop");
				break;
			}
		}
	}

}
 