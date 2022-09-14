package zoo.concrete;

import zoo.Mammal;
import zoo.interfaces.AdvancedFlyer;
import zoo.interfaces.Navigator;

public class Cat extends Mammal implements Navigator {

	@Override
	public void speak() {
		System.out.println("meiw");
	}

	
	@Override
	public void navigate() {
		System.out.println("navigate like a cat");
	}


}
