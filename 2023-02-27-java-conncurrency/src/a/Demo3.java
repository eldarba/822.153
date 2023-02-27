package a;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		// shared object
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		Thread printer = new Thread(new PrintLastElement(list));
		Thread remover = new Thread(new RemoveLastElement(list));

		printer.start();
		remover.start();

	}

}

class PrintLastElement implements Runnable {

	private List<Integer> list;

	public PrintLastElement(List<Integer> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("check last index to print");

		// critical section
		//////////////////////////////////////////////
		synchronized (list) {
			int index = list.size() - 1;
			if (index >= 0) {
				System.out.println("print last element");
				System.out.println(list.get(index));
			} else {
				System.out.println("no elements");
			}
		}
		//////////////////////////////////////////////
	}

}

class RemoveLastElement implements Runnable {

	private List<Integer> list;

	public RemoveLastElement(List<Integer> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("check last index to remove");
		// critical section
		//////////////////////////////////////////////
		synchronized (list) {
			int index = list.size() - 1;
			if (index >= 0) {
				System.out.println("remove last element");
				list.remove(index);
			} else {
				System.out.println("no elements");
			}
		}
		//////////////////////////////////////////////
	}

}
