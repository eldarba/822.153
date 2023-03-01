package b;

public class Main {

	public static void main(String[] args) {

		Building building = new Building();

		Student[] students = new Student[5];
		students[0] = new Student("Lea");
		students[1] = new Student("Dan");
		students[2] = new Student("Moshe");
		students[3] = new Student("Yoel");
		students[4] = new Student("Vered");

		BuildingGateKeeperThread t = new BuildingGateKeeperThread(building, students);
		t.start();

		BuildingOpenControllerThread opener = new BuildingOpenControllerThread(building);
		opener.start();

	}

}
