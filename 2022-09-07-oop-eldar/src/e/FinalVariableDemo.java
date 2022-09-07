package e;

public class FinalVariableDemo {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);

		x++;
		System.out.println(x);

		// final on local variables - variables that belongs to a method only
		final int y = 100;
		System.out.println(y);
		// y++;
		// y = 200;

		// blank final
		final int z;
		z = 10; // initialize
		System.out.println(z);

//		z = 150;
	}

}
