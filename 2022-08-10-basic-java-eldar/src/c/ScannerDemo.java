package c;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		{
			Scanner sc = new Scanner("aaa bbb ccc");
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			sc.close();
			System.out.println("=============");
		}

		{
			Scanner sc = new Scanner("aaa bbb ccc");
			System.out.println(sc.nextLine());
			sc.close();
			System.out.println("=============");
		}

		{
			Scanner sc = new Scanner("Moshe 25 Tel Aviv\naaa");
			String name = sc.next();
			int age = sc.nextInt();
			String address = sc.nextLine();
			System.out.println(name + " is " + age + " years old. lives in" + address);
			
			String x = sc.next();
			System.out.println(x);
			sc.close();
			System.out.println("=============");
		}
		
		
		
		

		

	}

}
