package d.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo8ReadTextFromFileBuffered {

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader(new FileReader("c:/temp/letter.txt"));) {
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
