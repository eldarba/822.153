package b;

public class Student {

	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public void enterBuilding(Building building) {
		building.enterBuilding(this.name);
	}

}
