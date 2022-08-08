package d;

public class IncrementDemo {

	public static void main(String[] args) {
		
		int c = 1;
		// increment by 1
		c = c + 1; // long
		c++; // short
		
		// increment by other value
		c = c + 5;
		c += 5;
		
		// decrement by 1
		c = c - 1;
		c--;

		// decrement by other value
		c = c - 5;
		c -= 5;
		
		System.out.println(c);
		
		int numberOfItemsSold = 0;
		numberOfItemsSold = numberOfItemsSold + 5;
		numberOfItemsSold += 5;
	}

}
