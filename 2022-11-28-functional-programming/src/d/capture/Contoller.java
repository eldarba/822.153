package d.capture;

public class Contoller {
	// we can capture instance variables
	public int instanceVar = 1000;
	// we can capture class variables
	public static int classVar = 2000;

	public Randomizer getRandomizer() {
		int localVar = 201; // we can capture local variables
		Randomizer r = () -> {
			int x = (int) (Math.random() * localVar + instanceVar + classVar);
			return x;
		};
		return r;
	}

	public static void main(String[] args) {
		Contoller contoller = new Contoller();
		Randomizer randomizer = contoller.getRandomizer();

		contoller.instanceVar = 2000;
		Contoller.classVar = 5000;
		System.out.println(randomizer.get());
	}

}
