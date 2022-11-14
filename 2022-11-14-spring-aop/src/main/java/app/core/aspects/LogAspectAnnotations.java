package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectAnnotations {

	@Before("@annotation(app.core.annotations.MyAnnotation)")
	public void beforeAnnotatedMethod() {
		System.out.println("--- >>> before annotated method");
	}

	@Before("@target(app.core.annotations.MyAnnotation)")
	public void beforeAnnotatedClass() {
		System.out.println("--- >>> before annotated class");
	}

}
