package a;

public class Tar {

	public static void main(String[] args) {
		System.out.println(smartParseInt("123"));
		System.out.println(smartParseInt("12a3"));
		System.out.println(smartParseInt("a12a3"));

	}

	public static int smartParseInt(String str) {
		while (str.length() > 0) {
			try {
				return Integer.parseInt(str);
			} catch (Exception e) {
				str = str.substring(0, str.length() - 1);
			}
		}
		return 0;
	}

}
