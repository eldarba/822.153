package a;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonProgram {

	public static void main(String[] args) {

		// set the main window
		JFrame fr = new JFrame("button program");
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 600, 300);
		// create a button object
		JButton button = new JButton("click");
		// put the button on the main window
		button.setBounds(100, 100, 150, 25);
		fr.add(button);
//		1. create a class and implement the interface
//		MyActionListener listener = new MyActionListener();
//		button.addActionListener(listener); // register the button to a listener

//		2. create an anonymous implementing type for the interface
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("clicked");
//
//			}
//		});

//		3.  lambda expression
		ActionListener listener = e -> System.out.println("clicked");
		button.addActionListener(listener);
		// display
		fr.setVisible(true);

	}

}
