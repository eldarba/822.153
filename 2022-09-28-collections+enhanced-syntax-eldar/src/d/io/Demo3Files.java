package d.io;

import java.io.File;
import java.io.IOException;

public class Demo3Files {

	public static void main(String[] args) throws IOException {

		File dir = new File("c:/temp");
		File file = new File(dir, "letter.txt");

		System.out.println(dir);
		System.out.println(file);

		if (dir.exists()) {
			System.out.println("directory exists");
		} else {
			System.out.println("directory NOT exists");
			dir.mkdirs();
			System.out.println("directory created");
		}

		if (file.exists()) {
			System.out.println("file exists");
		} else {
			System.out.println("file NOT exists");
			file.createNewFile();
			System.out.println("file created");
		}

	}

}
