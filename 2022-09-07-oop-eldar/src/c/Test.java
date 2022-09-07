package c;

public class Test {

	public static void main(String[] args) {
		
		// static reference to a static member
		System.out.println(Flower.MAX_HEIGHT);
		
		// dynamic reference to a dynamic member
		Flower rose = new Flower();
		rose.setHeight(10);
		rose.setNumberOfPetals(30);
		
		System.out.print(rose.color + ", ");
		System.out.print(rose.getHeight() + ", ");
		System.out.println(rose.getNumberOfPetals());
		
		
		System.out.println("flower count: " + Flower.getCounter());

	}

}
