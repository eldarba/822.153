package a.homework.sollution;

import java.util.Scanner;

public class Lab3Tar2LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = sc.nextInt();
		sc.close();

		System.out.println("Year is: " + year);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}

	}

}
