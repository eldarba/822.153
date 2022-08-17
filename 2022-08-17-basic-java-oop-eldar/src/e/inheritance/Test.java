package e.inheritance;

public class Test {

	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.name);
		System.out.println(employee.salary);
		System.out.println(employee.birthdate);
		// System.out.println(employee.department);

		Manager manager = new Manager();
		System.out.println(manager.name);
		System.out.println(manager.salary);
		System.out.println(manager.birthdate);
		System.out.println(manager.department);

	}

}
