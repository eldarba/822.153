package app.core.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Check;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "students")
@Check(constraints = "age >= 18 && age <= 120")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true)
	private String email;
	private int age;
	@Column(name = "enrollment_date")
	private LocalDate enrollment;
	private boolean active;
	@Enumerated(EnumType.STRING)
	private Subject subject;

	public enum Subject {
		MATH, LITERATURE, ART, PHYSICS, HEBREW, ENGLISH;
	}

}
