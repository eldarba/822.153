package g.waitNotify;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Stack stack = new Stack();
		Producer p1 = new Producer("p1", stack);
		Producer p2 = new Producer("p2", stack);
		p1.start();
		p2.start();
		
		Thread.sleep(5000);
		
		Consumer c1 = new Consumer("c1", stack);
		c1.start();

	}

}
