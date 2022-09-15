package c.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionsExamples {

	public static void main(String[] args) {
		
		
		File file = new File("c:/temp/notes1.txt");
		try {
			Scanner sc = new Scanner(file);
			String line = sc.nextLine();
			System.out.println(line);
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("we are very sory - file is not there");
		}

	}

}
