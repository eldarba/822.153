package a;

public class UsingSubStringMethod {

	public static void main(String[] args) {
		String str1 = "abcde";
		// 0 is the begin index (inclusive)
		// 3 is the end index (exclusive)
		String str2 = str1.substring(0, 3); // abc

		System.out.println(str1);
		System.out.println(str2);

		str2 = str1.substring(0, str1.length()); // abcde
		str2 = str1.substring(0, str1.length() - 1); // abcd
		str2 = str1.substring(0, str1.length() - 2); // abc
		str2 = str1.substring(0, str1.length() - 3); // ab
	}

}
