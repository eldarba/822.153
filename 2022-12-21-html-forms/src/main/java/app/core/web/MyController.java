package app.core.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// http://10.103.50.20:8080
@RequestMapping("/api")
public class MyController {

	public enum AlphabetPhoneticChar {
		ALPHA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT, GOLF, HOTEL, INDIA, JULIETT, KILO, LIMA, MIKE, NOVEMBER, OSCAR,
		PAPA, QUEBEC, ROMEO, SIERRA, TANGO, UNIFORM, VICTOR, WHISKEY, X_RAY, YANKEE, ZULU;

		public static AlphabetPhoneticChar getChar(Character character) {
			character = Character.toUpperCase(character);
			AlphabetPhoneticChar[] arr = AlphabetPhoneticChar.values();
			int index = character - 'A';
			return arr[index];
		}

		public static String convert(String text) {
			String msg = "";
			for (char c : text.toCharArray()) {
				if (c == ' ') {
					msg += " SPACE - ";
				} else {
					msg += getChar(c) + " - ";
				}
			}
			return msg;
		}
	}

	@GetMapping("/convert")
	public String convert(String text) {
		return AlphabetPhoneticChar.convert(text);
	}

	@GetMapping("/specified-char")
	public AlphabetPhoneticChar getChar(@RequestParam("char") Character character) {
		return AlphabetPhoneticChar.getChar(character);

	}

	@GetMapping("/random-char")
	public AlphabetPhoneticChar getRandomChar() {
		AlphabetPhoneticChar[] arr = AlphabetPhoneticChar.values();
		return arr[(int) (Math.random() * arr.length)];
	}

	@GetMapping("/hobbies")
	public String sendHobbies(@RequestParam("fav-color") String favoritColor, String... hobbies) {
		String response = "Your hobbies are: <ul>";
		for (String hobby : hobbies) {
			System.out.println(hobby);
			response += "<li>" + hobby + "</li>";
		}

		response += "</ul>";

		response += "favorite color: " + favoritColor;
		return response;
	}

}
