package b.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Demo1Semaphore {

	public static void main(String[] args) {

		// shared object
		List<Integer> list = new ArrayList<>();
		Semaphore semaphore = new Semaphore(1);

		list.add(1);
		list.add(2);
		list.add(3);

		Thread printer = new Thread(new PrintLastElement(list, semaphore));
		Thread remover = new Thread(new RemoveLastElement(list, semaphore));

		printer.start();
		remover.start();

	}

}

class PrintLastElement implements Runnable {

	private List<Integer> list;
	private Semaphore semaphore;

	public PrintLastElement(List<Integer> list, Semaphore semaphore) {
		super();
		this.list = list;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		System.out.println("check last index to print");

		// critical section
		//////////////////////////////////////////////
		try {
			this.semaphore.acquire();
			int index = list.size() - 1;
			if (index >= 0) {
				System.out.println("print last element");
				System.out.println(list.get(index));
			} else {
				System.out.println("no elements");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//////////////////////////////////////////////
		this.semaphore.release();
	}

}

class RemoveLastElement implements Runnable {

	private List<Integer> list;
	private Semaphore semaphore;

	public RemoveLastElement(List<Integer> list, Semaphore semaphore) {
		super();
		this.list = list;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		System.out.println("check last index to remove");
		// critical section
		//////////////////////////////////////////////
		try {
			this.semaphore.acquire();
			int index = list.size() - 1;
			if (index >= 0) {
				System.out.println("remove last element");
				list.remove(index);
			} else {
				System.out.println("no elements");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//////////////////////////////////////////////
		this.semaphore.release();
	}

}
