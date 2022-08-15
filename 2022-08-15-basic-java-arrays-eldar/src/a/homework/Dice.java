package a.homework;

public class Dice {

	int value = 1;

	/**
	 * this method rolls the dice and returns the new value
	 * @return the new dice value
	 */
	int roll() {
		value = (int) (Math.random() * 6) + 1;
		return value;
	}

}
