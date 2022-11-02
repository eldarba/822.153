package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;

@ComponentScan
@Configuration
public class MyConfig {
	
	@Bean("superman")
	@Primary
	public Person person() {
		Person p = new Person();
		p.setId(100);
		p.setName("Superman");
		p.setAge(350);
		return p;
	}
	
	@Bean
	@Scope("prototype")
	public Integer random() {
		return (int) (Math.random()*101);
	}

}
