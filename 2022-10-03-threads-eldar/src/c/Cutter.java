package c;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Cutter extends Thread {

	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			try {
				int seconds = random.nextInt(3, 7);
				TimeUnit.SECONDS.sleep(seconds); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}

}
