package d;

public class CounterNoSleep extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("---");
			// check the interrupted status
			if(this.isInterrupted()) {
				System.out.println("thread interrupted and will stop");
				break;
			}
		}
	}

}
