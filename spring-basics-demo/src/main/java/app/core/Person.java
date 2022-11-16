package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {

	{
		System.out.println("+++ Person CTOR");
	}

	int id;
	String name;
	@Value("${person.age}")
	int age;

	@Autowired
	public Person(String name) {
		super();
		this.name = name;
	}

	public void speak() {
		System.out.println(name + " is speaking");
	}

}
