package app.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
// @PropertySources({@PropertySource("a"), @PropertySource("b")})
public class App {

	public static void main(String[] args) {

		// the general interface for spring container
		ApplicationContext ctx;
		// one of several implementations for spring container
		ctx = new AnnotationConfigApplicationContext(App.class);
		System.out.println("spring container is up");

		String[] beans = ctx.getBeanDefinitionNames();
		for (String beanName : beans) {
			System.out.println(beanName);
		}

		System.out.println("============================");
		Integer rnd = ctx.getBean("randomNumberBean", Integer.class);
		System.out.println(rnd);

		String hello = ctx.getBean("the hello-string", String.class);
		System.out.println(hello);

		Person p = ctx.getBean("person", Person.class);
		Person p1 = ctx.getBean("person", Person.class);
		Person p3 = ctx.getBean("person", Person.class);
		p.speak();

		Person p2 = ctx.getBean("yakov", Person.class);
		p2.speak();
		System.out.println("age is " + p2.age);

	}

	@Bean
	public Person yakov() {
		Person p = new Person("Yakov");
		return p;
	}

	// bean methods
	// is called by the ctx when it is started
	// the return object is stored in the ctx and has a name
	@Bean
	public Integer randomNumberBean() {
		System.out.println("----------");
		return (int) (Math.random() * 101);
	}

	@Bean("the hello-string")
	public String hello() {
		return "Hello";
	}

}
