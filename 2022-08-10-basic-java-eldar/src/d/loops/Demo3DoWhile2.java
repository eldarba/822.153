package d.loops;

import java.util.Scanner;

public class Demo3DoWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int password = 123;
		int input;
		
		do {
			System.out.print("Enter password: ");
			input = sc.nextInt();
		}while(input != password);
		
		sc.close();
		
		System.out.println("You are logged in");

	}

}
