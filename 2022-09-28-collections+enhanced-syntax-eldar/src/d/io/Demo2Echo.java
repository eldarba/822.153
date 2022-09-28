package d.io;

import java.io.IOException;

public class Demo2Echo {

	public static void main(String[] args) throws IOException {

		int c = System.in.read(); // read the first byte from the stream

		while (c != 13) {
			System.out.write(c); // write the byte to the buffer
			c = System.in.read(); // read the next byte from the stream
		}
		
		System.out.flush(); // send the data from buffer to final destination
		
		System.out.close(); // never close default IO objects
		
		

	}

}
