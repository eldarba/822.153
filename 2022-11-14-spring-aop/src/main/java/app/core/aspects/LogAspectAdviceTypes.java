package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectAdviceTypes {

	// advice types
	// 1. before
	// 2. after
	// 3. after returning
	// 4. after throwing
	// 5. around

	@Before("execution(* *add*(..))")
	public void before(JoinPoint jp) {
		System.out.println("@Before: " + jp.getSignature().getName());
	}

}
