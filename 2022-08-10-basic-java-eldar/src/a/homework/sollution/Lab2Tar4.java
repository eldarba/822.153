package a.homework.sollution;

public class Lab2Tar4 {

	public static void main(String[] args) {
		
		int a = (int) (Math.random()*101);
		int b = (int) (Math.random()*101);
		int c = (int) (Math.random()*101);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("==================");
		
		if(a > b && a > c) {
			System.out.println(a);
		}else if(b > c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
