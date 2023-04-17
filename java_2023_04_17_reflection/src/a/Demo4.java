package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import types.Superman;

public class Demo4 {

	public static void main(String[] args) {
		
		Superman s1 = Superman.getInstance();
		Superman s2 = Superman.getInstance();
		
		s1.setAltitude(100);
		
		System.out.println(s1.getAltitude());
		System.out.println(s2.getAltitude());
		
		// use reflection to get another instance of superman
		try {
			Constructor<Superman> ctor = Superman.class.getDeclaredConstructor();
			System.out.println(ctor);
			ctor.setAccessible(true);
			Superman ilegalSuperman = ctor.newInstance();
			ilegalSuperman.setAltitude(1500); // another instance of the singleton Superman
			System.out.println(s1.getAltitude());
			System.out.println(ilegalSuperman.getAltitude());
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
