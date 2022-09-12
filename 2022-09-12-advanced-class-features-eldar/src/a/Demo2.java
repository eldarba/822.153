package a;

import javax.swing.JFrame;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		// create a graphical window object
		JFrame fr = new JFrame("Eldar");
		// configure the window
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 300, 300);
		// display the window
		fr.setVisible(true);
		
		Thread.sleep(1000);
		// move the window to the right 200 px
		fr.setLocation(fr.getX()+200, fr.getY());
		
		Thread.sleep(1000);
		fr.setLocation(fr.getX()+200, fr.getY());

		Thread.sleep(1000);
		fr.setLocation(0, 0);

	}

}
