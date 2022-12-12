package client;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.web.client.RestTemplate;

import lombok.Data;

public class App {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		JFrame fr = new JFrame("Dictionary Application");
		fr.setBounds(100, 100, 600, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);

		Font font = new Font(null, 0, 18);
		JLabel lb = new JLabel("enter word: ");
		lb.setFont(font);
		JTextField tfCarNumber = new JTextField();
		tfCarNumber.setFont(font);
		JButton btGetCar = new JButton("Find");
		btGetCar.setFont(font);
		JTextArea ta = new JTextArea(10, 50);
		ta.setFont(font);

		lb.setBounds(10, 10, 150, 30);
		tfCarNumber.setBounds(150, 10, 150, 30);
		btGetCar.setBounds(10, 50, 150, 30);
		ta.setBounds(10, 100, 500, 150);
		ta.setEditable(false);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);

		fr.add(lb);
		fr.add(tfCarNumber);
		fr.add(btGetCar);
		fr.add(ta);

		btGetCar.addActionListener(e -> {
			String word = tfCarNumber.getText();
			System.out.println(word);
			String url = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;
			System.out.println(url);
			Entry[] entries = rt.getForObject(url, Entry[].class);
			ta.setText(entries[0].meanings[0].definitions[0].definition);
		});

		fr.setVisible(true);

	}

	@Data
	static class Entry {
		private String word;
		private Meaning[] meanings;
	}

	@Data
	static class Meaning {
		Definition[] definitions;
	}

	@Data
	static class Definition {
		String definition;
	}

}
