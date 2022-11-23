package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Student;
import app.core.entities.University;
import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;

@Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private UniversityRepo universityRepo;
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("======== TEST 1");
		// create 2 universities and 5 students
		Student st1 = new Student(0, "Meir", 22, null);
		Student st2 = new Student(0, "Yoni", 33, null);
		Student st3 = new Student(0, "Tomer", 18, null);
		Student st4 = new Student(0, "Yafa", 26, null);
		Student st5 = new Student(0, "Yona", 19, null);

		University telAviv = new University(0, "Tel Aviv", null);
		University barIlan = new University(0, "Bar Ilan", null);

		telAviv.addStudent(st1);
		telAviv.addStudent(st2);

		barIlan.addStudent(st3);
		barIlan.addStudent(st4);
		barIlan.addStudent(st5);

		universityRepo.save(telAviv);
		universityRepo.save(barIlan);

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
