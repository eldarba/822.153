package fruites;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		FruitFactory factory = new FruitFactory();

		factory.add(new Apple(5));
		factory.add(new Apple(3));
		factory.add(new Apple(5));
		factory.add(new Apple(3));
		factory.add(new Orange(5));
		factory.add(new Orange(5));
		factory.add(new Orange(5));
		factory.add(new Orange(4));
		factory.add(new Orange(4));

		System.out.println("small apples: " + Arrays.toString(factory.getSmallApples()));
		System.out.println("medium apples: " + Arrays.toString(factory.getMediumApples()));
		System.out.println("big apples: " + Arrays.toString(factory.getBigApples()));

		System.out.println("small oranges: " + Arrays.toString(factory.getSmallOranges()));
		System.out.println("medium oranges: " + Arrays.toString(factory.getMediumOranges()));
		System.out.println("big oranges: " + Arrays.toString(factory.getBigOranges()));

		System.out.println("small peaches: " + Arrays.toString(factory.getSmallPeaches()));
		System.out.println("medium peaches: " + Arrays.toString(factory.getMediumPeaches()));
		System.out.println("big peaches: " + Arrays.toString(factory.getBigPeaches()));

	}

}
