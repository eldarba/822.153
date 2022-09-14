package a.enums.schedule;

import a.enums.schedule.Scheduler.Day;

public class Test {

	public static void main(String[] args) {
		
		Scheduler scheduler = new Scheduler();
		
		scheduler.addTask(Day.SUNDAY, "study Java");
		scheduler.addTask(Day.MONDAY, "go hyking");
		scheduler.addTask(Day.MONDAY, "go shopping");
		
		System.out.println(scheduler.getTasks(Day.MONDAY));
		System.out.println(scheduler.getTasks(Day.TUESDAY));

	}

}
