package c.overload;

public class Test {

	public static void main(String[] args) {

		Printer printer = new Printer();
		printer.print("three times", 3);
		printer.print("only once");

		System.out.println("==========");
		System.out.println(5);
		System.out.println(5.3);
		System.out.println(true);

	}

}
