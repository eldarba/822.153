package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import types.Calculator;

public class Demo2 {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		// calculator.selfDestruct(); // compile error - not visible

		// use reflection to invoke selfDestruct
		try {
			Method selfDestructMethod = calculator.getClass().getDeclaredMethod("selfDestruct");
			selfDestructMethod.setAccessible(true);
			System.out.println(selfDestructMethod);
			selfDestructMethod.invoke(calculator);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
