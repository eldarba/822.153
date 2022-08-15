package b.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	/*
	 * demo of assigning array elements from input data using scanner
	 * */
	public static void main(String[] args) {
		
		int[] grades = new int[5];
		Scanner sc = new Scanner(System.in);
		// populate array with input data
		for (int i = 0; i < grades.length; i++) {
			System.out.print("enter grade: ");
			grades[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(Arrays.toString(grades));
		
		// print the best grades only
		System.out.println("best grades 8 and up");
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] >= 8) {
				System.out.println(grades[i]);
			}
		}

	}

}
