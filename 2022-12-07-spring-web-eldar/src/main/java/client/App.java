package client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.web.client.RestTemplate;

public class App {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		JFrame fr = new JFrame("Dictionary Application");
		fr.setBounds(100, 100, 600, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);

		JLabel lb = new JLabel("enter word: ");
		JTextField tfCarNumber = new JTextField();
		JButton btGetCar = new JButton("Find");
		JTextArea ta = new JTextArea(10, 50);

		lb.setBounds(10, 10, 150, 25);
		tfCarNumber.setBounds(150, 10, 150, 25);
		btGetCar.setBounds(10, 50, 150, 25);
		ta.setBounds(10, 100, 500, 150);
		ta.setEditable(false);

		fr.add(lb);
		fr.add(tfCarNumber);
		fr.add(btGetCar);
		fr.add(ta);

		btGetCar.addActionListener(e -> {
			String word = tfCarNumber.getText();
			System.out.println(word);
			String url = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;
			System.out.println(url);
			String resp = rt.getForObject(url, String.class);
			System.out.println(resp);
			ta.setText(resp);
		});

		fr.setVisible(true);

	}

}
