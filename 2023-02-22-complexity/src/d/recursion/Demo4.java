package d.recursion;

import java.math.BigInteger;

public class Demo4 {

	static long factorial(int n) {
		long f = 1;
		for (int i = 2; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	static long factorialRecursion(int n) {
		// base case is when n == 1 (and when == 0)
		if (n == 0 || n == 1) {
			return 1;
		} else {
			// other cases
			return n * factorialRecursion(n - 1);
		}
	}

	static BigInteger factorialRecursionBig(int n) {
		// base case is when n == 1 (and when == 0)
		if (n == 0 || n == 1) {
			return new BigInteger("1");
		} else {
			// other cases
//			return n * factorialRecursion(n - 1);
			return factorialRecursionBig(n - 1).multiply(new BigInteger(String.valueOf(n)));
		}
	}

	public static void main(String[] args) {
		int n = 0;
		System.out.println(n + "! = " + factorialRecursionBig(n));
	}

}
