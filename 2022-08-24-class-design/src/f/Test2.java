package f;

public class Test2 {

	public static void main(String[] args) {
		// this array is a name pool:
		String[] names = { "Adi", "Ran", "Ben", "Yehoodit", "Mira", "Tamir", "Danny", "Meir", "Roni", "Ilana" };
		// this array contains Person elements:
		Person[] persons = new Person[25];

		for (int i = 0, id = 101; i < persons.length; i++, id++) {
			String name = names[(int) (Math.random() * names.length)]; // pick random name
			int age = (int) (Math.random() * 50); // random age
			Person p = new Person(id, name, age); // create person
			persons[i] = p; // insert the person object to the array
			// print a single element from the array
			System.out.println(persons[i]);
		}

		// print the entire array
		// System.out.println(Arrays.toString(persons));

	}

}
