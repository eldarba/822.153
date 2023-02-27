package a;

public class Demo1 {

	public static void main(String[] args) {

		// define what the thread should do
		Runnable r1 = () -> System.out.println("Hi from " + Thread.currentThread().getName());

		// creating 3 threads with the same runnable and different tames
		Thread t1 = new Thread(r1, "t1");
		t1.setPriority(Thread.MAX_PRIORITY);

		Thread t2 = new Thread(r1, "t2");
		Thread t3 = new Thread(r1, "t3");

		// using the start method we start the thread execution
		t1.start();
		t2.start();
		t3.start();

	}

}
