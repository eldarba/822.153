package d.animals;

public class Test1 {

	public static void main(String[] args) {

		// create an array of Animal objects (Cats, Cows, Dogs etc.)
		Animal[] animals = new Animal[5];
		// populate the array with different type of animals
		animals[0] = new Animal();
		animals[1] = new Cat();
		animals[2] = new Dog();
		animals[3] = new Cow();
		animals[4] = new Poodle();
		// set animals age
		animals[0].age = 8;
		animals[1].age = 2;
		animals[2].age = 11;
		animals[3].age = 3;
		animals[4].age = 7;

		// print all animal types and ages
		for (int i = 0; i < animals.length; i++) {
			// System.out.println(animals[i].getClass().getSimpleName() + ": age " +
			// animals[i].age);
			animals[i].speak();
			// with instanceof operator we check if current animal is Cat
			if (animals[i] instanceof Cat) {
				Cat cat = (Cat) animals[i];
				cat.climb();
			}
		}

	}

}
