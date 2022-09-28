package d.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4WritingTextToFile {

	public static void main(String[] args) {
		
		File file = new File("c:/temp/letter.txt");
		
		try(FileWriter out = new FileWriter(file);) {
			out.write("line 1\n");
			out.write("line 2\n");
			out.write("line 3\n");
			Integer val = 125;
			out.write(val.toString()); // why can't we write 125 to file?
			System.out.println("data written to file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
