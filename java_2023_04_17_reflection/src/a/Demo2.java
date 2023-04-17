package a;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import types.Calculator;

public class Demo2 {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		// calculator.selfDestruct(); // compile error - not visible

		try {
			// use reflection to invoke selfDestruct - private method
			Method selfDestructMethod = calculator.getClass().getDeclaredMethod("selfDestruct");
			selfDestructMethod.setAccessible(true);
			System.out.println(selfDestructMethod);
			selfDestructMethod.invoke(calculator);

			// use reflection to access - private fields
			Field resultField = calculator.getClass().getDeclaredField("result");
			resultField.setAccessible(true);
			System.out.println(resultField);

			// get
			double result = resultField.getDouble(calculator);
			System.out.println(result);

			// set
			resultField.setDouble(calculator, 250);
			result = resultField.getDouble(calculator);
			System.out.println(result);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
		}

	}

}
