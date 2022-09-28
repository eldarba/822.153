package e.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1ByteStream {

	public static void main(String[] args) {

		// files
		File srcFile = new File("files/kitten.jpg"); // existing file
		File dstFile = new File("files/kittenCoppy.jpg"); // will be created when run

		// an object for reading byte stream from file with buffer
		// an object for writing byte stream to file with buffer
		try (

				BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));

				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dstFile));

		) {

			int b = in.read(); // read first byte

			while (b != -1) {
				out.write(b); // write current byte to file
				b = in.read(); // read the next byte
			}

			System.out.println("data was copied from");
			System.out.println(srcFile);
			System.out.println("to");
			System.out.println(dstFile);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
