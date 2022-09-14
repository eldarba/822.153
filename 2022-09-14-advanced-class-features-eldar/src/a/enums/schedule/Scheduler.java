package a.enums.schedule;

public class Scheduler {

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY;

		public String tasks;
	}

	public void addTask(Day day, String tasks) {
		if (day.tasks == null) {
			day.tasks = "  * " + tasks;
		} else {
			day.tasks += "\n" +  "  * " + tasks;
		}
	}

	public String getTasks(Day day) {
		// return day + ": " + (day.tasks != null ? day.tasks : "No Tasks Today");
		String msg = day + ":\n";
		if (day.tasks != null) {
			msg += day.tasks;
		} else {
			msg += "  No Tasks Today";
		}
		return msg;
	}

	public void cancelTasks(Day day) {
		day.tasks = null;
		System.out.println("all tasks for " + day + " deleted");
	}

	public void displayAllWeekTasks() {
		System.out.println("=== All Tasks ===================");
		for (Day day : Day.values()) {
			System.out.println(getTasks(day));
		}
		System.out.println("=== ========= ===================");
	}

}
