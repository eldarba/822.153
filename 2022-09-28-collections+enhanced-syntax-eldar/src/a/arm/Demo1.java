package a.arm;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// ARM - Auto Resource Management
		// try with resources
		try (Scanner sc = new Scanner("aaa bbb ccc");) {
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
		}

	}

}
