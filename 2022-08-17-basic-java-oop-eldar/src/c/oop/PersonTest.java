package c.oop;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setId(101);
		p.setName("Uri");
		p.setAge(25);
		
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		System.out.println(p.getId() + ", " + p.getName() + ", " + p.getAge());

	}

}
