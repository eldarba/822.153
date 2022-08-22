package a.homework;

import java.util.Arrays;

public class Lab10Tar4 {

	/*
	 * Create a class that calculates students' average year grade.
	 * 
	 * create a matrix according to the following:
	 * 
	 * there are 20 students in class
	 * 
	 * there are 10 different grades per student (randomize values between 80-100 as
	 * input)
	 * 
	 * print each student average grade
	 * 
	 * print the class average grade
	 */
	public static void main(String[] args) {

		int students = 20;
		int grades = 10;
		int[][] gradeMatrix = new int[students][grades];
		double totalAvg = 0;

		for (int i = 0; i < gradeMatrix.length; i++) {
			double sum = 0;
			for (int j = 0; j < gradeMatrix[i].length; j++) {
				gradeMatrix[i][j] = (int) (Math.random() * 20) + 80; // 80 - 99
				sum += gradeMatrix[i][j];
			}
			System.out.print(Arrays.toString(gradeMatrix[i]));
			double stdAvg = sum / gradeMatrix[i].length;
			System.out.println("\tavg: " + stdAvg);
			totalAvg += stdAvg;
		}

		double classAvg = totalAvg / gradeMatrix.length;
		// System.out.println("class average: " + classAvg);
		System.out.printf("class average: %1.2f%n", classAvg); // print formated
		// %1.2f - take a double or float and print with precision of 2 decimal digits

	}

}
