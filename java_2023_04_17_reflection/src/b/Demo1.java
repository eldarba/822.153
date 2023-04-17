package b;

import types.Calculator;

public class Demo1 {

	public static void main(String[] args) {
		
		// reflection is based on the class Class.
		// from class we get: Field, Constructor, Method
		
		// 3 ways to get a class reference
		
		// 1. from class
		Class<?> class1 = Calculator.class;
		System.out.println(class1);
		
		// 2. from instance 
		Calculator calculator = new Calculator();
		Class<?> class2 = calculator.getClass();
		System.out.println(class2);
		
		// 3. from class name
		try {
			Class<?> class3 = Class.forName("types.Calculator");
			System.out.println(class3);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
