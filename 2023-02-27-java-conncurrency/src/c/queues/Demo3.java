package c.queues;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo3 {

	public static void main(String[] args) {

		BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
		System.out.println("remainingCapacity: " + queue.remainingCapacity());

		try {
			queue.put("aaa");
			queue.put("aaa");
			queue.put("aaa");
			System.out.println("remainingCapacity: " + queue.remainingCapacity());
			System.out.println("queue: " + queue);

			List<String> list = new ArrayList<>();
			System.out.println("list: " + list);

			// drain - will empty the queue to a collection
			queue.drainTo(list);
			System.out.println("queue: " + queue);
			System.out.println("list: " + list);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
