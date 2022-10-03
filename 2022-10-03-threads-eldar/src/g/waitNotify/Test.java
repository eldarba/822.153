package g.waitNotify;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Stack stack = new Stack();
		Producer p1 = new Producer("p1", stack, 10);
		Producer p2 = new Producer("p2", stack, 10);
		Consumer c1 = new Consumer("c1", stack, 20);
		
		p1.start();
		p2.start();
		
		Thread.sleep(5000);
		
		c1.start();

	}

}
