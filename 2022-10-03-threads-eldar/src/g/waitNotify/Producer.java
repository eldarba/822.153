package g.waitNotify;

public class Producer extends Thread {

	private Stack stack;
	private int quantity;

	public Producer(String name, Stack stack, int quantity) {
		super(name);
		this.stack = stack;
		this.quantity = quantity;
	}

	@Override
	public void run() {
		for (int i = 0; i < quantity; i++) {
			int r = (int) (Math.random() * 101);
			stack.push(r);
			System.out.println(getName() + " pushed " + r);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
