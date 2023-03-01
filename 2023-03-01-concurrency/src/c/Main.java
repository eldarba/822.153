package c;

import java.util.concurrent.CyclicBarrier;

public class Main {

	public static void main(String[] args) {

		// commands to be run when the barrier is tripped before releasing the threads
		Runnable barrier1Action = () -> System.out.println("barrier1Action executing - let waiting threads go");
		Runnable barrier2Action = () -> System.out.println("barrier2Action executing - let waiting threads go");

		int parties = 2; // number of threads to arrive barrier before tripping it
		CyclicBarrier barrier1 = new CyclicBarrier(parties, barrier1Action);
		CyclicBarrier barrier2 = new CyclicBarrier(parties, barrier2Action);

	}

}
