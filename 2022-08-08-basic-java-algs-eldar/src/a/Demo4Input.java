package a;

import java.util.Scanner;

public class Demo4Input {

	public static void main(String[] args) {
		
		// an object to get input from keyboard
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
		// perform input using the scanner
		String userName = sc.nextLine();
		
		System.out.println(userName);
		
		sc.close(); // close the scanner at the end

	}

}
