package e.daemon;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Timer timer = new Timer();
		timer.setDaemon(true);
		System.out.println(timer.isDaemon());
		
		timer.start();
		
		Thread.sleep(10000);
		System.out.println("END");
	}

}
