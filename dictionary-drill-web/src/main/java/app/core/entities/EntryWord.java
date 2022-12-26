package app.core.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = { "id" })
@ToString(exclude = { "sentences" })

@Entity
@Table(name = "entries")
public class EntryWord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String word;
	private String definition;

	@OneToMany(mappedBy = "entryWord", cascade = CascadeType.ALL)
	private List<ExampleSentence> sentences;

	public EntryWord(int id, String word, String definition, List<ExampleSentence> sentences) {
		super();
		this.id = id;
		this.word = word;
		this.definition = definition;
		this.sentences = sentences;
		for (ExampleSentence exampleSentence : this.sentences) {
			exampleSentence.setEntryWord(this);
		}
	}

}
