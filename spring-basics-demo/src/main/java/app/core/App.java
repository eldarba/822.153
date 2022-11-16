package app.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {

	public static void main(String[] args) {

		// the general interface for spring container
		ApplicationContext ctx;
		// one of several implementations for spring container
		ctx = new AnnotationConfigApplicationContext(App.class);

		String[] beans = ctx.getBeanDefinitionNames();
		for (String beanName : beans) {
			System.out.println(beanName);
		}

	}

	// bean methods
	// is called by the ctx when it is started
	// the return object is stored in the ctx and has a name
	@Bean
	public Integer randomNumberBean() {
		System.out.println("----------");
		return (int) (Math.random() * 101);
	}

}
