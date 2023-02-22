package c.dataStructure;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Demo1Queue {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayBlockingQueue<>(100);
		q.add(5);
		q.add(2);
		q.add(3);

		System.out.println(q);

		System.out.println(q.remove());
		System.out.println(q);

		q.add(100);
		System.out.println(q);

		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);

	}

}
