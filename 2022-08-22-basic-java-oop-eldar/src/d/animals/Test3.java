package d.animals;

public class Test3 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();

		makeAnimalSpeak(dog);
		makeAnimalSpeak(cat);

	}

	public static void makeAnimalSpeak(Animal animal) {
		animal.speak();
	}

}
