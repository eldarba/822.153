package c.oop;

import java.util.Scanner;

public class PersonTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		
		System.out.print("enter id: ");
		p.setId(sc.nextInt());
		sc.nextLine(); // waste the new line in the scanner pipeline
		
		System.out.print("enter name:");
		p.setName(sc.nextLine());

		System.out.print("enter age: ");
		p.setAge(sc.nextInt());
		
		sc.close();
		
		p.print();

	}

}
