package a.homework.sollution;

public class Lab2Tar3 {

	public static void main(String[] args) {

		double salary = (int) (Math.random() * 1001) + 5000;
		System.out.println("salary: " + salary);

		if (salary * 1.1 <= 6000) {
			salary = salary * 1.1;
		} else {
			salary = salary * 1.05;
		}

		System.out.println(salary);
	}

}
