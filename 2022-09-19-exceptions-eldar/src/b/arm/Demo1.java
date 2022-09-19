package b.arm;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// ARM - try with resources is when we put closables (like scanner) in ()
		// java will close the object when try is finished
		try (
				
				Scanner sc = new Scanner(System.in); 
				
				Scanner sc2 = new Scanner("aaa");
				
				// String str = "aaa"; // not closable
				
				MyClosable closable = new MyClosable();
				
				) {
			System.out.println("enter a");
			int a = sc.nextInt();
			System.out.println("enter b");
			int b = sc.nextInt();
			System.out.println(a + b);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
