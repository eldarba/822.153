package a;

import java.util.Scanner;

public class Demo6Input {

	public static void main(String[] args) {
		
		// input 2 numbers from user and print sum
		
		Scanner sc = new Scanner(System.in); // create a scanner for input operations
		
		System.out.print("enter 1st number: "); // prompt user for input
		double a = sc.nextDouble(); // perform first input
		
		System.out.print("enter 2nd number: "); // prompt user for input
		double b = sc.nextDouble(); // perform second input
		
		double sum = a + b; // calculate sum
		
		System.out.println(sum); // print sum (output)
		
		sc.close(); // close the scanner when done to save system resources

	}

}
