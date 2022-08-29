package fruites;

public class FruitFactory {

	private Orange[][] oranges = new Orange[3][25];
	private Apple[][] apples = new Apple[3][25];
	private Peach[][] peaches = new Peach[3][25];
	int so = 0; // index for storing small oranges
	int mo = 0; // index for storing medium oranges
	int bo = 0; // index for storing big oranges
	int sa = 0; // index for storing small apples
	int ma = 0; // index for storing medium apples
	int ba = 0; // index for storing big apples
	int sp = 0; // index for storing small peaches
	int mp = 0; // index for storing medium peaches
	int bp = 0; // index for storing big peaches

	public void add(Fruit fruit) {
		if (fruit instanceof Orange) {
			if (fruit.getSize() == 3) {
				oranges[0][so++] = (Orange) fruit;
			} else if (fruit.getSize() == 4) {
				oranges[1][mo++] = (Orange) fruit;
			} else {
				oranges[2][bo++] = (Orange) fruit;
			}
		}
		if (fruit instanceof Apple) {
			if (fruit.getSize() == 3) {
				apples[0][sa++] = (Apple) fruit;
			} else if (fruit.getSize() == 4) {
				apples[1][ma++] = (Apple) fruit;
			} else {
				apples[2][ba++] = (Apple) fruit;
			}
		}
		if (fruit instanceof Peach) {
			if (fruit.getSize() == 3) {
				peaches[0][sp++] = (Peach) fruit;
			} else if (fruit.getSize() == 4) {
				peaches[1][mp++] = (Peach) fruit;
			} else {
				peaches[2][bp++] = (Peach) fruit;
			}

		}
	}

	public Orange[] getSmallOranges() {
		return oranges[0];
	}

	public Orange[] getMediumOranges() {
		return oranges[1];
	}

	public Orange[] getBigOranges() {
		return oranges[2];
	}

	public Apple[] getSmallApples() {
		return apples[0];
	}

	public Apple[] getMediumApples() {
		return apples[1];
	}

	public Apple[] getBigApples() {
		return apples[2];
	}

	public Peach[] getSmallPeaches() {
		return peaches[0];
	}

	public Peach[] getMediumPeaches() {
		return peaches[1];
	}

	public Peach[] getBigPeaches() {
		return peaches[2];
	}

}
