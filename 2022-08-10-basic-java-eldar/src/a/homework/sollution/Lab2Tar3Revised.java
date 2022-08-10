package a.homework.sollution;

public class Lab2Tar3Revised {

	public static void main(String[] args) {
		
		int minSalary = 5000;
		int maxSalary = 6000;
		double raseRate = 0.1;

		double salary = (int) (Math.random() * (maxSalary-minSalary + 1)) + minSalary;
		System.out.println("salary: " + salary);

		if (salary * (1 + raseRate) <= maxSalary) {
			salary = salary * (1 + raseRate);
		} else {
			salary = maxSalary;
		}

		System.out.println(salary);
	}

}
