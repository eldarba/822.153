package b.flow.control.ifDemo;

public class Demo3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);
		int max;

		// concatenation - connecting data into one string
		System.out.println(a + ", " + b);

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		System.out.println(max);

	}

}
