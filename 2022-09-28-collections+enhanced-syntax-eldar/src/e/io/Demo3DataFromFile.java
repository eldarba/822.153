package e.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3DataFromFile {

	public static void main(String[] args) {

		long a;
		float b;
		byte c;
		boolean d;
		short e;

		File file = new File("files/file.data");

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			a = in.readLong();
			b = in.readFloat();
			c = in.readByte();
			d = in.readBoolean();
			e = in.readShort();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
