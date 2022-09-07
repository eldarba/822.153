package f;

public class Test {

	public static void main(String[] args) {
		
		Superman superman = Superman.getInstance();
		superman.setAltitude(100);
		
		Superman superman2 = Superman.getInstance();
		superman2.setAltitude(150);
		
		System.out.println(superman);
		System.out.println(superman2);

	}

}
 