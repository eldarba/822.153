package a.enums.planets;

public enum Planet {

	MERCURY(1, 1), VENUS(2, 2), EARTH(3, 3), MARS(4, 4), JUPITER(5, 5), SATURN(6, 6), URANUS(7, 7), NEPTUNE(8, 8);

	private final int mass;
	private int orbit;

	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	public int getOrbit() {
		return orbit;
	}

	public void setOrbit(int orbit) {
		this.orbit = orbit;
	}

	public int getMass() {
		return mass;
	}
	
	
	
	

}
