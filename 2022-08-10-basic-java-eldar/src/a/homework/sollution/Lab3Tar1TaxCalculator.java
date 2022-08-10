package a.homework.sollution;

import java.util.Scanner;

public class Lab3Tar1TaxCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		double tax = 0D;
		sc.close();

		if (salary <= 23_000) {
			tax = salary * 0.1;
		} else {
			tax = 23_000 * 0.1; // deduct entire first grade
			if (salary <= 50_000) {
				// tax = tax + (salary - 23_000) * 0.2;
				tax += (salary - 23_000) * 0.2;
			} else {
				tax += 27_000 * 0.2; // deduct entire 2nd grade
				if(salary <= 100_000) {
					tax += (salary - 50_000) * 0.3;
				}else {
					tax += 50_000 * 0.3; // deduct entire 3rd grade
					tax += (salary- 100_000) * 0.4;
				}
			}
		}

		System.out.println("salary before tax: " + salary + " ₪");
		System.out.println("tax: " + tax + " ₪");
		System.out.println("salary after tax: " + (salary - tax) + " ₪");

	}

}
