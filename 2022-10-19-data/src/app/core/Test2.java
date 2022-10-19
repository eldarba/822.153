package app.core;

public class Test2 {

	public static void main(String[] args) {
		
		PersonController controller = new PersonController();
		controller.load();
		
		System.out.println(controller.getPerson(101));
		System.out.println(controller.getPerson(102));
		System.out.println(controller.getPerson(103));

	}

}
