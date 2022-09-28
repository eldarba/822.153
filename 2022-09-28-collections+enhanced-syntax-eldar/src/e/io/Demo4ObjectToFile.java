package e.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import b.sortingLists.Person;

public class Demo4ObjectToFile {

	public static void main(String[] args) {
		
		
		// create an object
		Person person = new Person(101, "Aviad Levi", 32);
		
		// serialize the object to stream and send it to file
		File file = new File("files/person.obj");
		
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
			out.writeObject(person);
			System.out.println(person);
			System.out.println("was written to");
			System.out.println(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
