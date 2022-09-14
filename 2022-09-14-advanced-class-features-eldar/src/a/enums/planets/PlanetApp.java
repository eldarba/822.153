package a.enums.planets;

import java.util.Arrays;
import java.util.Scanner;

public class PlanetApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("choose planet");
		System.out.println(Arrays.toString(Planet.values()));
		Planet planet = Planet.valueOf(sc.nextLine().toUpperCase());
		System.out.println("data about " + planet);
		System.out.println("order in solar sytem: " + (planet.ordinal() + 1));
		System.out.println("mass: " + planet.getMass());
		System.out.println("orbit: " + planet.getOrbit());
		sc.close();

	}

}
