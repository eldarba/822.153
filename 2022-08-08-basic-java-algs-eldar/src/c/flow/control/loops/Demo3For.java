package c.flow.control.loops;

public class Demo3For {

	public static void main(String[] args) {

		for (int c = 0; c <= 5; c++) {
			System.out.println(c); // 0,1,2,3,4,5
		}

		System.out.println("==========");

		for (int c = 0; c <= 5; c += 2) {
			System.out.println(c); // 0,2,4
		}

		System.out.println("==========");

		for (int c = 5; c >= 0; c--) {
			System.out.println(c); // 5,4,3,2,1,0
		}

	}

}
