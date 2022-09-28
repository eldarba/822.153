package c.varargs;

public class Demo2 {

	public static void main(String[] args) {
		print("aaa", "bbb", "ccc");
		String str = concat("aaa", "bbb", "ccc");
		System.out.println(str);
	}

	// tar 1
	public static void print(String... arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

	// tar 2
	public static String concat(String... arr) {
		String str = "";
		for (String curr : arr) {
			str += curr;
		}
		return str;
	}

}
