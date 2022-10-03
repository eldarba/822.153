package f.synch;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car(111);
		
		Driver moshe = new Driver("Moshe", 150, car);
		Driver lea = new Driver("Lea", 40, car);
		
		moshe.start();
		lea.start();

	}

}
