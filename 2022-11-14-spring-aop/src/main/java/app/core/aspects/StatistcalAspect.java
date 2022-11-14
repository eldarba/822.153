package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StatistcalAspect {

	private int useCount;
	private int buyCount;

	public int getUseCount() {
		return useCount;
	}

	public int getBuyCount() {
		return buyCount;
	}

	@Before("execution(* *use*(..))")
	public void beforeUse() {
		useCount++;
	}

	@Before("execution(* *buy*(..))")
	public void beforeBuy() {
		buyCount++;
	}

}
