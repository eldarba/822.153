package e.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import b.sortingLists.Person;

public class Demo5ObjectFromFile {

	public static void main(String[] args) {

		// serialize the object to stream and send it to file
		File file = new File("files/person.obj");

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			Person person = (Person) in.readObject();
			System.out.println(person);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
