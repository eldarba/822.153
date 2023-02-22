package d.recursion;

public class Demo1 {

	// this technical demonstration will produce error if we run it
	static void f() {
		System.out.println("Hi");
		f(); // function f calls function f
	}

	public static void main(String[] args) {
		f();
	}
}
