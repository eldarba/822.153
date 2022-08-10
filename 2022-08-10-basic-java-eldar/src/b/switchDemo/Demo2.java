package b.switchDemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter mode: [off, on, low, medium, high]");
		String mode = sc.nextLine();
		sc.close();

		switch (mode) {
		case "off":
			System.out.println("turn oven off");
			break;
		case "on":
			System.out.println("turn oven on");
			break;
		case "low":
			System.out.println("turn oven to 100");
			break;
		case "medium":
			System.out.println("turn oven to 200");
			break;
		case "high":
			System.out.println("turn oven to 300");
			break;
		default: // default is optional
			System.out.println(mode + " is not supported");
		}

	}

}
