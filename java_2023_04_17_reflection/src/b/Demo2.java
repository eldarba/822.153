package b;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import types.Calculator;

public class Demo2 {

	public static void main(String[] args) {

		Class<?> clazz = Calculator.class;

		Field[] fields = clazz.getDeclaredFields();
		// fields = clazz.getFields(); // public fields
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("==============");

		Method[] methods = clazz.getDeclaredMethods();
		// methods = clazz.getMethods(); // public methods
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("==============");

	}

}
