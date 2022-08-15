package a.homework;

public class Lab4Tar6 {

	/**
	 * Create a class that defines two random values ‘max’ and ‘den’ and prints all
	 * the numbers from 0 to ‘max’ that can be divided with ‘den’
	 */
	public static void main(String[] args) {

		int max = (int) (Math.random() * 101); // 0 - 100
		int den = (int) (Math.random() * 9) + 2; // 2 - 10
		
		System.out.println("max: " + max);
		System.out.println("den: " + den);
		
		
		for(int n = 0; n <= max;n++) {
//			 System.out.println(n + " % " + den + " = " + (n % den));
			if(n % den == 0) {
				System.out.println(n);
			}
		}
		
		
		

	}

}
