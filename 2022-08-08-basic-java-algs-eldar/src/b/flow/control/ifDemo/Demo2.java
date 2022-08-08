package b.flow.control.ifDemo;

public class Demo2 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11);
		System.out.println(r);

		// if-else construct:

		if (r > 5) {
			System.out.println("Big");
		} else {
			System.out.println("Small");
		}

	}

}
