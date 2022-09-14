package zoo.tests;

import zoo.Animal;
import zoo.concrete.Ant;
import zoo.concrete.Bat;
import zoo.concrete.Butterfly;
import zoo.concrete.Dog;
import zoo.concrete.Hawk;
import zoo.concrete.Ostrich;
import zoo.interfaces.AdvancedFlyer;
import zoo.interfaces.Flyer;
import zoo.interfaces.Navigator;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[1] = new Bat();
		animals[2] = new Ostrich();
		animals[3] = new Dog();
		animals[4] = new Hawk();
		animals[5] = new Dog();
		animals[6] = new Dog();
		animals[7] = new Ant();
		animals[8] = new Butterfly();
		animals[9] = new Dog();
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			System.out.print(animal.getClass().getSimpleName() + ": ");
			Thread.sleep(500);
			animal.speak();
			if(animal instanceof AdvancedFlyer) {
				AdvancedFlyer advancedFlyer = (AdvancedFlyer) animal;
				Thread.sleep(500);
				advancedFlyer.takeOff();
				Thread.sleep(500);
				advancedFlyer.fly();
				Thread.sleep(500);
				advancedFlyer.navigate();
				Thread.sleep(500);
				advancedFlyer.land();
			}else {
				if(animal instanceof Flyer) {
					Thread.sleep(500);
					Flyer flyer = (Flyer) animal;
					flyer.fly();
				}
				if(animal instanceof Navigator) {
					Thread.sleep(500);
					Navigator navigator = (Navigator) animal;
					navigator.navigate();
				}
			}
			System.out.println("=====================");
			Thread.sleep(500);
		}
	}
}
