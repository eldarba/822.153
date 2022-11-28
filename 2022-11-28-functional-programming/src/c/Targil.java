package c;

import javax.swing.JButton;

public class Targil {

	public static void main(String[] args) {

		Thread t = new Thread(() -> System.out.println("hello"));

		JButton bt = new JButton();
		bt.addActionListener((event) -> System.out.println("clicked"));
		bt.doClick();
		bt.doClick();
		bt.doClick();

		t.start();

	}

}
