package a;

import java.lang.reflect.Field;

public class Demo5 {

	public static void main(String[] args) {

		Runnable target = () -> {
			System.out.println("HI");
		};

		Thread t = new Thread(target);

		t.start();

		// try to access the private filed 'target' of the Thread object
		try {
			Field targetFiled = Thread.class.getDeclaredField("target");
			targetFiled.setAccessible(true); // error - module java.base douse not open this option for reflection
			System.out.println(targetFiled);
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
