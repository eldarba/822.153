package app.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import app.core.beans.Car;
import app.core.beans.Engine;
import app.core.beans.FamilyCar;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class Config {

	@Bean
	public Car sportsCar(@Qualifier("turboEngine") Engine engine) {
		FamilyCar car = new FamilyCar(engine);
		return car;
	}

}
