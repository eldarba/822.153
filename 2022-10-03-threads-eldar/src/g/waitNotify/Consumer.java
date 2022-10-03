package g.waitNotify;

public class Consumer extends Thread {

	private Stack stack;
	private int quantity;

	public Consumer(String name, Stack stack, int quantity) {
		super(name);
		this.stack = stack;
		this.quantity = quantity;
	}

	@Override
	public void run() {
		for (int i = 0; i < quantity; i++) {
			int x =stack.pop();
			System.out.println(getName() + " popped " + x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
