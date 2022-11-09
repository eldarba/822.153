package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TurboEngine implements Engine {

	@Override
	public void turnOn() {
		System.out.println("turbo engine on");
	}

	@Override
	public void turnOff() {
		System.out.println("turbo engine off");
	}

}
