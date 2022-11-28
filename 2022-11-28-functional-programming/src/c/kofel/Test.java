package c.kofel;

public class Test {

	public static void main(String[] args) {

		Kofel kofel2 = x -> x * 2;
		Kofel kofel5 = x -> x * 5;
		Kofel kofel100 = x -> x * 100;

		System.out.println(kofel2.kfol(5));
		System.out.println(kofel5.kfol(5));
		System.out.println(kofel100.kfol(5));

		// invoke static method
		Kofel.doSomething();
		// invoke the default dynamic method
		kofel2.doSomethingElse();

	}

}
