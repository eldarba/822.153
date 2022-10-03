package a;

public class App1 {

	public static void main(String[] args) {
		System.out.println("main started");

		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		t1.start();
		t2.start();

		MyRunnable r1 = new MyRunnable();
		Thread t3 = new Thread(r1, "t3");
		Thread t4 = new Thread(r1, "t4");
		t3.start();
		t4.start();

		System.out.println("main ended");
	}

}
 