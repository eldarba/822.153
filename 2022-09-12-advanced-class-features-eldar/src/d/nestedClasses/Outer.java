package d.nestedClasses;

public class Outer {

	private static int x;
	private int y;

	//
	public class Inner {

		{
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static class Nested {

		{
			System.out.println(x);
			// System.out.println(y); // error - static members are not dependent on dynamic members
		}
	}

	public static void main(String[] args) {
		// to create nested we dont need an instance of the enclosing type - Outer
		Nested nested = new Nested();

		// to create inner we need an instance of the enclosing type - Outer
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
	}

}
