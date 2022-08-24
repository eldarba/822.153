package c.overload;

public class Printer {

	// this method is an overload for print
	public void print(String msg) {
		System.out.println(msg);
	}

	// this method is an overload for print
	public void print(String msg, int times) {
		for (int i = 0; i < times; i++) {
			print(msg);
		}
	}

}
