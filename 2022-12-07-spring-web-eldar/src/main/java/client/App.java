package client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

public class App {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();

		JFrame fr = new JFrame("Dictionary Application");
		fr.setBounds(100, 100, 1200, 400);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);

		JLabel lbEnterWord = new JLabel("enter word: ");
		JTextField tfEnterWord = new JTextField();
		JButton btGetCar = new JButton("Find");
		JTextArea textArea = new JTextArea(0, 1500);

		lbEnterWord.setBounds(10, 10, 150, 25);
		tfEnterWord.setBounds(100, 10, 150, 25);
		btGetCar.setBounds(10, 50, 240, 25);

		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 100, 1000, 150);

		fr.add(lbEnterWord);
		fr.add(tfEnterWord);
		fr.add(btGetCar);
		fr.add(scrollPane);

		btGetCar.addActionListener(e -> {
			String word = tfEnterWord.getText();
			String url = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;
			try {
				Entry[] entries = rt.getForObject(url, Entry[].class);

				StringBuilder stringBuilder = new StringBuilder();
				for (int i = 0; i < entries.length; i++) {
					Entry entry = entries[i];
					stringBuilder.append(i + 1).append(") ").append(entry.word).append("\n");
					Meaning[] meanings = entry.meanings;
					for (Meaning meaning : meanings) {
						stringBuilder.append(" [").append(meaning.partOfSpeech).append("]");
						Definition[] definitions = meaning.definitions;
						for (Definition definition : definitions) {
							stringBuilder.append("\n").append("   - ").append(definition.definition);
						}
						stringBuilder.append("\n");
					}
					stringBuilder.append("\n");
				}
				textArea.setText(stringBuilder.toString());
			} catch (RestClientResponseException responseException) {
				String errorMsg = responseException.getResponseBodyAsString();
				try {
					DictionaryError dictionaryError = objectMapper.readValue(errorMsg, DictionaryError.class);
					String err = dictionaryError.title + "\n" + dictionaryError.message + "\n"
							+ dictionaryError.resolution;
					textArea.setText(err);
				} catch (Exception e1) {
					textArea.setText(errorMsg);
				}
			}
		});

		fr.setVisible(true);

	}

	@Data
	static class Entry {
		String word;
		Meaning[] meanings;
	}

	@Data
	static class Meaning {
		String partOfSpeech;
		Definition[] definitions;
	}

	@Data
	static class Definition {
		String definition;
	}

	@Data
	static class DictionaryError {
		String title;
		String message;
		String resolution;
	}

}
