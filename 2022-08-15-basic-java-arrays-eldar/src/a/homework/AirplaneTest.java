package a.homework;

public class AirplaneTest {

	public static void main(String[] args) {
		
		Airplane airplane = new Airplane();
		System.out.println("altitude: " + airplane.altitude + ", direction: " + airplane.direction);
		
		airplane.turnEast();
		System.out.println("altitude: " + airplane.altitude + ", direction: " + airplane.direction);

	}

}
