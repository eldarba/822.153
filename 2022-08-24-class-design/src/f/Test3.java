package f;

public class Test3 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Ann", 35);
		Person p2 = new Person(359, "Oren", 40);
		Person p3 = new Person(101, "Ann", 38);

		int hash = p1.hashCode();
		System.out.println(hash);

		System.out.println(p2.hashCode());

		String str1 = new String("aaa");
		String str2 = new String("aaa");

		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true

		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));

	}

}
