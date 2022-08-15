package a.homework;

public class Airplane {

	/** the airplane current altitude in yards */
	int altitude;
	/** the airplane current direction in degrees (0 - 359) */
	int direction;

	
	void goHigherTenYard() {
		altitude += 10;
	}

	void goLowerTenYard() {
		altitude -= 10;
	}

	void turnNorth() {
		direction = 0;
	}

	void turnEast() {
		direction = 90;
	}

	void turnSouth() {
		direction = 180;
	}

	void turnWest() {
		direction = 270;
	}

}
