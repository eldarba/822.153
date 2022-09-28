package d.io;

import java.io.IOException;
import java.io.PrintStream;

public class Demo1 {

	public static void main(String[] args) {
		
		PrintStream out = System.out;
		
		out.println("Hello World");
		
		System.err.println("error");
		
		try {
			int c =System.in.read();
			System.out.println(c);
			System.out.println((char)c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
