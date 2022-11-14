package app.core.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Before("execution(void buyCoupon(int))")
	public void beforeBuy() {
		System.out.println(">>> before buy");
	}

	// execution(return-type [package.class.]method(parameters) [throws])
	// execution is a pointcut designator
	// () - no parameters
	// (int) - one parameter of type int
	// (.) - one parameter of any type
	// (..) - 0 or more parameters of any type
	@Before("execution(void use*(..))")
	public void beforeUse() {
		System.out.println(">>> before use: " + LocalDateTime.now());
	}

}
