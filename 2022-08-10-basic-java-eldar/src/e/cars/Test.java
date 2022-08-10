package e.cars;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.number = 111;
		c2.number = 222;
		
		System.out.println(c1.number);
		System.out.println(c2.number);
		
		c1.drive();

	}

}
