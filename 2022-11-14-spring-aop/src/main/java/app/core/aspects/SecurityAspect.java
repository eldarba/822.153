package app.core.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.security.LoginManager;

@Component
@Aspect
public class SecurityAspect {

	@Autowired
	private LoginManager loginManager;

	@Around("execution(* app.core.facades.*.*(..))")
	public Object loginAdvice(ProceedingJoinPoint jp) throws Throwable {
		if (loginManager.isLogged()) {
			return jp.proceed();
		} else {
			throw new RuntimeException("You are not logged in");
		}
	}

}
