package f.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window {

	public static void main(String[] args) {

		// creating a graphical window object
		JFrame fr = new JFrame("My Application"); // CTOR
		// set methods:
		fr.setLocation(200, 200);
		fr.setSize(500, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set the window layout manager to null
		fr.setLayout(null);

		JLabel lb1 = new JLabel("first name");
		lb1.setBounds(20, 20, 150, 25);
		fr.add(lb1);

		JTextField tf = new JTextField();
		tf.setBounds(200, 20, 150, 25);
		fr.add(tf);

		fr.setVisible(true);
		// get methods
		System.out.println(fr.getX());
		System.out.println(fr.getY());

	}

}
