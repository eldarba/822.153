package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

public class App {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)){
			
			Person p1 = ctx.getBean("person", Person.class);
			Person p2 = ctx.getBean("person", Person.class);
			Person p3 = ctx.getBean(Person.class);
			
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			
			int x = ctx.getBean(Integer.class);
			int y = ctx.getBean(Integer.class);
			int z = ctx.getBean(Integer.class);
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}

	}

}
