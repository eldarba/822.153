package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import types.Calculator;

public class Demo1 {

	public static void main(String[] args) {
		
		// this is a reference to a Calculator instance
		Object obj = new Calculator();
		
		// a reference to the Calculator class
		Class<? extends Object> clazz = obj.getClass();
		System.out.println(clazz);
		
		// get a reference to a class method
		try {
			Method addMethod = clazz.getMethod("add", double.class);
			System.out.println(addMethod);
			
			// invoke the method
			addMethod.invoke(obj, 5);
			
			// invoke the getResult method and print the current result
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
