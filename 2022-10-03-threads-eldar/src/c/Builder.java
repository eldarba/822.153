package c;

public class Builder extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 60; i++) {
			System.out.print("*");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
