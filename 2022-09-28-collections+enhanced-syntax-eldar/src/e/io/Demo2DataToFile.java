package e.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2DataToFile {

	public static void main(String[] args) {

		long a = 2000;
		float b = 125.36F;
		byte c = 100;
		boolean d = false;
		short e = 700;

		File file = new File("files/file.data");

		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			out.writeLong(a);
			out.writeFloat(b);
			out.writeByte(c);
			out.writeBoolean(d);
			out.writeShort(e);
			System.out.println("data written to file: " + file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
