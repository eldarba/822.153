package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Student;
import app.core.repositories.StudentRepository;

@Service // denotes the this is a facade - application logic is here
@Transactional
public class AppService {

	@Autowired
	private StudentRepository studentRepository;

	public Student createStudent(Student student) {
		if (this.studentRepository.existsById(student.getId())) {
			throw new RuntimeException(student + " already exists");
		}
		return this.studentRepository.save(student);
	}

	public Student getStudent(int id) {
		Optional<Student> opt = this.studentRepository.findById(id);
		if (opt.isPresent()) {
			Student student = opt.get();
			return student;
		} else {
			throw new RuntimeException("student not found - " + id);
		}
	}

	public Student updateStudentAllFields(Student student) {
		if (this.studentRepository.existsById(student.getId())) {
			return this.studentRepository.save(student);
		}
		throw new RuntimeException(student + " not found");
	}

	/**
	 * update the name and age of the specified student if found
	 * 
	 * @param student
	 * @return the updated student
	 */
	public Student updateStudent(Student student) {
		Optional<Student> opt = this.studentRepository.findById(student.getId());
		if (opt.isPresent()) {
			Student studentFromDB = opt.get();
			studentFromDB.setName(student.getName());
			studentFromDB.setAge(student.getAge());
			return studentFromDB;
		} else {
			throw new RuntimeException("student not found - " + student.getId());
		}
	}

	public void deleteStudent(int id) {
		if (this.studentRepository.existsById(id)) {
			this.studentRepository.deleteById(id);
		} else {
			throw new RuntimeException("delete failed - not found - " + id);
		}
	}

	public List<Student> getAllStudents() {
		return this.studentRepository.findAll();
	}

}
