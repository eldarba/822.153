package b;

import javax.swing.JOptionPane;

public class Demo1Wrappers {

	public static void main(String[] args) {
		int x = 5; // primitive
		Integer a = 5; // object

		double y = 5.32; // primitive
		Double b = 5.32; // object

		System.out.println(x + ", " + a + ", " + y + ", " + b);

		// minimum maximum methods:
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println("=========================");
		// parse methods - converts from String to the desired type
		String userInput = JOptionPane.showInputDialog("Enter a number");
		System.out.println(userInput);
		// convert String to int using wrapper class
		int val = Integer.parseInt(userInput);

	}

}
