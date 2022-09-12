package a;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(1);
		
		Thread.sleep(1000); // cause the program to stop for 1 second
		System.out.println(2);
		
		Thread.sleep(1000);
		System.out.println(3);

		Thread.sleep(1000);
		System.out.println(4);

	}

}
