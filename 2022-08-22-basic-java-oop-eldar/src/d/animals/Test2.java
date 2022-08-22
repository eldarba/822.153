package d.animals;

public class Test2 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.age = 4;

		Cow cow = new Cow();
		cow.age = 5;

		Cat cat = new Cat();

		System.out.println(dog.age);
		System.out.println(cow.age);

		dog.speak(); // woof
		cow.speak();
		cat.speak();

	}

}
