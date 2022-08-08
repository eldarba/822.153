package b.flow.control.ifDemo;

public class Demo4 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);
		System.out.println(a + ", " + b);

		int max = a > b ? a : b;

		System.out.println(max);

	}

}
