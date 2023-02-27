package c.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo2QueueConcurrent {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

	}

}

class Producer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			queue.put(1);
			Thread.sleep(1000);
			queue.put(2);
			Thread.sleep(1000);
			queue.put(3);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Consumer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			System.out.println(this.queue.take());
			System.out.println(this.queue.take());
			System.out.println(this.queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
