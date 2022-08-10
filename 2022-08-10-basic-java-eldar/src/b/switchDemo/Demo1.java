package b.switchDemo;

public class Demo1 {

	public static void main(String[] args) {

//		String mode = "off";
//		String mode = "on";
//		String mode = "low";
//		String mode = "medium";
//		String mode = "high";
		String mode = "extra";

		switch (mode) {
		case "off":
			System.out.println("turn oven off");
			break;
		case "on":
			System.out.println("turn oven on");
			break;
		case "low":
			System.out.println("turn oven to 100");
			break;
		case "medium":
			System.out.println("turn oven to 200");
			break;
		case "high":
			System.out.println("turn oven to 300");
			break;
		default: // default is optional
			System.out.println(mode + " is not supported");
		}

	}

}
