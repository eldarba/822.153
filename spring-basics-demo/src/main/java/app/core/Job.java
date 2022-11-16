package app.core;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Job extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("--- JOB");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	@PostConstruct
	public void startJob() {
		this.start();
	}

	@PreDestroy // works on singleton beans only
	public void stopJob() {
		this.interrupt();
	}

}
