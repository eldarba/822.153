package c;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static c.MyStatics.A;

public class Demo2StaticImport {

	public static void main(String[] args) {

		// static reference with static import
		// no need specify class name
		System.out.println(PI);
		System.out.println(random());
		System.out.println(A);

	}

}
