package b;

import java.util.Scanner;

public class BuildingOpenControllerThread extends Thread {

	private Building building;

	public BuildingOpenControllerThread(Building building) {
		super();
		this.building = building;
		this.setDaemon(true);
	}

	@Override
	public void run() {
		try (Scanner sc = new Scanner(System.in);) {
			while (true) {
				System.out.print("which floor to open: ");
				int floor = Integer.parseInt((sc.nextLine()));
				building.openFloor(floor);
			}
		}

	}

}
