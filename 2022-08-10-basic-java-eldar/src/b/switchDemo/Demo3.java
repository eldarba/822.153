package b.switchDemo;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1, 2, or 3");
		int key = sc.nextInt();
		sc.close();

		switch (key) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println(key + " is illegal");
		}
	}

}
