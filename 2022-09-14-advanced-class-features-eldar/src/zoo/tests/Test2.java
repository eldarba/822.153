package zoo.tests;

import java.util.Arrays;

import zoo.Zoo;
import zoo.concrete.Ant;
import zoo.concrete.Bat;
import zoo.concrete.Butterfly;
import zoo.concrete.Cat;
import zoo.concrete.Dog;

public class Test2 {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Bat());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Butterfly());
		zoo.addAnimal(new Ant());
		zoo.addAnimal(new Bat());
		zoo.addAnimal(new Cat());

		System.out.println(Arrays.toString(zoo.getMammals()));
		System.out.println(Arrays.toString(zoo.getMammalsThatAreNotFlyers()));
		System.out.println(Arrays.toString(zoo.getInsectsThatAreNotFlyers()));

	}

}
