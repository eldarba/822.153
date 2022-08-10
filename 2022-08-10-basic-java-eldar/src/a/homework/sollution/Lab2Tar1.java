package a.homework.sollution;

public class Lab2Tar1 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 101);
		System.out.println(r);

		if (r > 50) {
			System.out.println("Big");
		} else if (r < 50) {
			System.out.println("Small");
		} else {
			System.out.println("Bingo");
		}

	}

}
