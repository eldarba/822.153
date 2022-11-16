package app.core.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
@Entity
public class Book {

	@Id
	private int id;
	private String title;
	private String author;
	private LocalDate publication;
	private double price;
}
