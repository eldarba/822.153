package c.flow.control.loops;

import java.util.Scanner;

public class Demo2While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int secretPassword = 123;
		int c = 1;

		System.out.print("enter password: ");
		int input = sc.nextInt();
		c++;

		// != (not equals)
		while (c <= 3 && input != secretPassword) {
			System.out.print("enter password: ");
			input = sc.nextInt();
			c++;
		}

		// check if c is 3 or less
		if (input == secretPassword) {
			System.out.println("you are logged in");
		} else {
			System.out.println("login failed");
		}

		sc.close();

	}

}
