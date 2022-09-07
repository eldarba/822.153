package demos;

import java.util.Date;

public class TimeStampDemo {

	public static void main(String[] args) {

		// Machine Time is time stamp
		long ts0 = 0;
		long tsNow = System.currentTimeMillis();
		
		System.out.println(ts0);
		System.out.println(tsNow);
		
		// Human Time is Date and Time
		Date dateZero = new Date(ts0);
		Date dateNow = new Date(tsNow);
		
		System.out.println(dateZero);
		System.out.println(dateNow);

	}

}
