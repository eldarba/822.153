package a.functional.interfaces;

import java.util.function.UnaryOperator;

public class Demo3 {

	public static void main(String[] args) {

		UnaryOperator<Integer> add5 = x -> x + 5;

		int x = 10;
		System.out.println(x);
		x = add5.apply(x);
		System.out.println(x);

		System.out.println("=============================");
		UnaryOperator<String> toUpper = str -> str.toUpperCase();
		String name = "moshe";
		System.out.println(name);
		name = toUpper.apply(name);
		System.out.println(name);

		System.out.println(change("aaa", toUpper));
		System.out.println(change("aAa", str -> str.toLowerCase()));
		System.out.println(change("  aa a   ", str -> str.trim()));
	}

	public static String change(String str, UnaryOperator<String> unaryOperator) {
		return unaryOperator.apply(str);
	}

}
