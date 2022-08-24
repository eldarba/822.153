package c.overload;

public class Printer {

	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(String msg, int times) {
		for (int i = 0; i < times; i++) {
			print(msg);
		}
	}

}
