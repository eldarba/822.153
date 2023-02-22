package d.recursion;

public class Demo1 {

	static void f() {
		System.out.println("Hi");
		f(); // function f calls function f
	}

	public static void main(String[] args) {
		f();
	}
}
