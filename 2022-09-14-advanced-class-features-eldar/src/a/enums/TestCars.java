package a.enums;

import java.util.Arrays;
import java.util.Scanner;

import a.enums.Car.Make;

public class TestCars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// choosing color
		System.out.println("choose color");
		// get an array of all enum constants
		Color[] colors = Color.values();
		System.out.println(Arrays.toString(colors));
		String input = sc.nextLine();
		// convert String to an enum constant
		Color color = Color.valueOf(input.toUpperCase());
		
		// choosing make
		System.out.println("choose make");
		System.out.println(Arrays.toString(Car.Make.values()));
		Make make = Make.valueOf(sc.nextLine().toUpperCase());
		
		// creating a car
		Car car = new Car(color, make);
		System.out.println(car);
		
		sc.close();

	}

}
