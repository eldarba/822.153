package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = { "books" })
@Entity
public class Reader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany
	@JoinTable(name = "readers_books",

			joinColumns = @JoinColumn(name = "reader_id"),

			inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<Book> books;

	public void addBook(Book book) {
		if (this.books == null) {
			this.books = new ArrayList<>();
		}
		books.add(book);
	}

}
