package a.functional.interfaces;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {

		Function<String, Integer> stringLengthFunction = str -> str.length();

		String str = "aaa";

		System.out.println(str);
		int length = stringLengthFunction.apply(str);
		System.out.println(length);

	}

}
