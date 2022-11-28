package c.kofel;

@FunctionalInterface
public interface Kofel {

	// one abstract method
	int kfol(int val);

	// any number of static methods
	static void doSomething() {
		System.out.println("doing something");
	}

	// any number of default methods
	default void doSomethingElse() {
		System.out.println("doing something else");
	}

}
