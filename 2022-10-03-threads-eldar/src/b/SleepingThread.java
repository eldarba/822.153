package b;

public class SleepingThread extends Thread {

	public SleepingThread(String name) {
		super(name);
	}

	public SleepingThread() {
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " - " + getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
