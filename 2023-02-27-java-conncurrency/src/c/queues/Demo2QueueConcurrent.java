package c.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo2QueueConcurrent {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));

		producer.start();
		consumer.start();

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

			// fill the queue again
//			queue.put(4);
//			queue.put(5);
//			queue.put(6); // now queue is full
//			System.out.println(queue);

			////////////////////////////////////////////////
			// Add to a full queue
//			queue.put(100); // will block
//			queue.add(100); // will throw

//			System.out.println("attempt to offer without timeout");
//			boolean added = queue.offer(100);
//			System.out.println("added? " + added);
//			System.out.println(queue);

//			System.out.println("attempt to offer with timeout");
//			boolean added = queue.offer(100, 3, TimeUnit.SECONDS);
//			System.out.println("added? " + added);
//			System.out.println(queue);

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
			// Examine
			System.out.println(this.queue);
			System.out.println(this.queue.peek());
			System.out.println(this.queue);

			System.out.println(this.queue.take());
			System.out.println(this.queue.take());
			System.out.println(this.queue.take());

//			System.out.println("attempt to take");
//			System.out.println(this.queue.take()); // blocked until queue has elements

//			System.out.println("attempt to poll without timeout");
//			System.out.println(this.queue.poll()); // returns an element or null if queue is empty

//			System.out.println("attempt to poll with timeout");
//			System.out.println(this.queue.poll(3, TimeUnit.SECONDS));

			// Examine
			System.out.println(this.queue);
			System.out.println(this.queue.peek()); // returns null if empty
//			System.out.println(this.queue.element()); // throws if empty
			System.out.println(this.queue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
