package b;

public class BuildingGateKeeperThread extends Thread {

	private Building building;
	private Student[] students;

	public BuildingGateKeeperThread(Building building, Student[] students) {
		super();
		this.building = building;
		this.students = students;
	}

	@Override
	public void run() {
		for (Student student : students) {
			student.enterBuilding(building);
		}
	}

}
