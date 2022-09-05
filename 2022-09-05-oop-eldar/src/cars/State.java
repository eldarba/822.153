package cars;

public class State {

	private String name;
	private Highway[] highways = new Highway[5];
	private int i;

	public State(String name) {
		super();
		this.name = name;
	}

	/**
	 * get the number of cars on a specific highway
	 * 
	 * @param highwayIndex the specified highway
	 * @return the number of cars on the specified highway
	 */
	public int getNumberOfCars(int highwayIndex) {
		// get a reference to the specified highway
		Highway highway = highways[highwayIndex];
		// get a reference to the array of cars on the highway
		Car[] highwayCars = highway.getCars();
		int counter = 0; // start a counter
		// iterate over the array of cars
		for (int i = 0; i < highwayCars.length; i++) {
			Car car = highwayCars[i]; // get a reference to a car in the array (can be null)
			if (car != null) {
				counter++; // count the found car
			}
		}
		return counter; // re turn the car count
	}

	public void addHighway(Highway highway) {
		highways[i++] = highway;
	}

	public String getName() {
		return name;
	}

	public Highway[] getHighways() {
		return highways;
	}

}
