package c;

public class Flower {
	
	//FIELDS:

	// class variable
	private static int counter;
	// constant
	public final static int MAX_HEIGHT = 20;
	
	// instance variables
	// final field must be initialized but will not change
	public final String color = "Red";
	private int height;
	private int numberOfPetals;

	// CTOR
	public Flower() {
		counter++; // increment counter on each new instance
	}

	// class method (static)
	public static int getCounter() {
		return counter;
	}


	// instance methods
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getNumberOfPetals() {
		return numberOfPetals;
	}

	public void setNumberOfPetals(int numberOfPetals) {
		this.numberOfPetals = numberOfPetals;
	}

}
