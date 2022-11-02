package a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create a spring container object
		// we want to use annotations configuration
		System.out.println("start a container");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		Person p = ctx.getBean(Person.class);
		System.out.println(p);

		ctx.close();
		System.out.println("container stopped");

	} 

}
