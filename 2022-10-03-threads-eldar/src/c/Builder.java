package c;

public class Builder extends Thread {

	private int times;
	private int rate;
	private String content;

	public Builder(int times, int rate, String content) {
		super();
		this.times = times;
		this.rate = rate;
		this.content = content;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(content);
			try {
				Thread.sleep(rate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
