package d.animals;

public class Test4 {

	public static void main(String[] args) {
		// declare a polymorphic reference
		Animal animal;
		// use the Animal reference to point to a Dog
		animal = new Dog();
		makeAnimalSpeak(animal);

		// use the Animal reference to point to a Cat
		animal = new Cat();
		makeAnimalSpeak(animal);

		// use the Animal reference to point to a Poodle
		animal = new Poodle();
		makeAnimalSpeak(animal);

	}

	//
	public static void makeAnimalSpeak(Animal animal) {
		animal.speak();
	}

}
