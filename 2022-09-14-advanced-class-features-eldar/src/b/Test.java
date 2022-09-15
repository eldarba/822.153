package b;

public class Test {

	public static void main(String[] args)  {
		Calculator calculator = new Calculator();

		int sum = calculator.add(4, 8);
		System.out.println(sum);

		try {
			System.out.println(calculator.div(10, 3));
			System.out.println(calculator.div(1000, 4));
			System.out.println(calculator.div(10, 0));
			System.out.println(calculator.div(10, 12));
			System.out.println(calculator.div(10, 7));
		} catch (Exception e) {
			// handler
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("END");

	}

}
