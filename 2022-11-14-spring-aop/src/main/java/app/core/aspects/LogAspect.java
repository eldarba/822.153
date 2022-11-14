package app.core.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Component
@Aspect
public class LogAspect {

	// @Before("execution(void buyCoupon(int))")
	public void beforeBuy() {
		System.out.println(">>> before buy");
	}

//	@Before("use() || buy()")
	@Before("allFacadePackage() && !use()")
	public void beforeUse(JoinPoint jp) {
		System.out.println(">>> before : " + jp.getSignature().getName() + ": " + LocalDateTime.now());
	}

	// define pointcuts
	@Pointcut("execution(void use*(..))")
	public void use() {

	}

	// execution is a pointcut designator
	// () - no parameters
	// (int) - one parameter of type int
	// (.) - one parameter of any type
	// (..) - 0 or more parameters of any type

	@Pointcut("execution(void buy*(..))")
	public void buy() {

	}

	// execution(return-type [package.class.]method(parameters) [throws])
	// all methods in a package
	@Pointcut("execution(* app.core.facades.*.*(..))")
	public void allFacadePackage() {
	}

}
