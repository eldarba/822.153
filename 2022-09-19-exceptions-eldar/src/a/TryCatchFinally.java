package a;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter a");
			int a = sc.nextInt();
			System.out.println("enter b");
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println(a + " + " + b + " = " + sum);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			return;
		} finally { // do it anyway block
			sc.close();
			System.out.println("scanner closed");
		}
		
		System.out.println("SUCCESS");
		

	}

}
