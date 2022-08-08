package a;

public class Demo3 {

	public static void main(String[] args) {
		
		int x = 100;
		
		System.out.println("start");
		
		// block
		{
			// local variable - local to the block
			int a = 5; // a variable declared in a block belongs to the block only
			System.out.println(a);
		}
		
		System.out.println("aaaa");
		
		// block
		{
			int a = 20;
			System.out.println(a);
		}
		
		System.out.println("stop");

	}

}
