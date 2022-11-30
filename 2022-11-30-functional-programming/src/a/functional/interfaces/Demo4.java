package a.functional.interfaces;

import java.util.function.BinaryOperator;

public class Demo4 {

	public static void main(String[] args) {

		BinaryOperator<Integer> add = (a, b) -> a + b; // lambda expression
		BinaryOperator<Integer> add2 = Integer::sum; // method reference

		int sum = add.apply(5, 9);
		int sum2 = add2.apply(5, 9);
		System.out.println(sum);
		System.out.println(sum2);

	}

}
