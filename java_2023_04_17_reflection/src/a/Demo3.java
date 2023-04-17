package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import types.Calculator;

public class Demo3 {

	public static void main(String[] args) {
		
		
		try {
			// get the class reference
			Class<Calculator> clazz = Calculator.class;
			System.out.println(clazz);
			// get a CTOR reference
			Constructor<Calculator> ctor = clazz.getConstructor();
			// create a new instance
			Calculator calculator = ctor.newInstance();
			calculator.add(25);
			calculator.mul(3);
			System.out.println(calculator.getResult());
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
