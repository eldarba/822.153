package cars;

public class Test2State {

	public static void main(String[] args) {
		
		// create a state object:
		State state = new State("Israel");
		
		// add 3 highways to the state:
		state.addHighway(new Highway("A"));
		state.addHighway(new Highway("B"));
		state.addHighway(new Highway("C"));
		
		// add 3 cars to highway A
		state.getHighways()[0].addCar(new Car(111, 30));
		state.getHighways()[0].addCar(new Car(222, 60));
		state.getHighways()[0].addCar(new Car(333, 0));
		state.getHighways()[0].addCar(new Car(123, 0));
		// add 2 cars to highway B
		state.getHighways()[1].addCar(new Car(444, 100));
		state.getHighways()[1].addCar(new Car(555, 80));
		
		// print the number of cars on highway A
		System.out.println("number of cars on highway A is: " + state.getNumberOfCars(0));
		// print the number of cars on highway B
		System.out.println("number of cars on highway B is: " + state.getNumberOfCars(1));

	}

}
