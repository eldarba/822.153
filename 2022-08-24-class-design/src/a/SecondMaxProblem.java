package a;

import java.util.Scanner;

public class SecondMaxProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 enter number: ");

		int input = sc.nextInt();
		int m1 = input; // maximum
		int m2 = input; // second after maximum

		for (int i = 2; i <= 10; i++) {
			System.out.print(i + " enter number: ");
			input = sc.nextInt();
			if (m1 == m2) {
				// if we are here m1 = m2
				if (input > m1) {
					m1 = input;
				} else {
					m2 = input;
				}
			} else {
				// if we are here m1 > m2
				if (input > m1) {
					m2 = m1;
					m1 = input;
				} else if (m1 > input && input > m2) {
					m2 = input;
				}
			}
		}

		sc.close();

		if (m1 != m2) {
			System.out.println("second max is " + m2);
		} else {
			System.out.println("all input is " + m1);
		}

	}

}
