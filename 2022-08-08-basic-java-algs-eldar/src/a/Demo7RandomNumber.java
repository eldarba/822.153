package a;

public class Demo7RandomNumber {

	public static void main(String[] args) {

//		System.out.println(Math.random()); // 0 - 0.9999999999
//		System.out.println(Math.random() * 11); // 0 - 10.9999999999
//		System.out.println((int) (Math.random() * 11)); // 0 - 10

		// a [0 - 100]
		int a = (int) (Math.random() * 101);
		System.out.println(a);

		// b [0 - 5]
		int b = (int) (Math.random() * 6);
		System.out.println(b);

		// c [10 - 20]
		int c = (int) (Math.random() * 11) + 10;
		System.out.println(c);

		// r [low - high] inclusive
		int low = 1;
		int high = 6;
		int d = (int) (Math.random() * (high - low + 1)) + low;
		System.out.println(d);

	} 

}
