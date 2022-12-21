package app.core.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// http://10.103.50.20:8080
@RequestMapping("/api")
public class MyController {

	public enum AlphabetPhoneticChar {
		ALPHA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT, GOLF, HOTEL, INDIA, JULIETT, KILO, LIMA, MIKE, NOVEMBER, OSCAR,
		PAPA, QUEBEC, ROMEO, SIERRA, TANGO, UNIFORM, VICTOR, WHISKEY, X_RAY, YANKEE, ZULU;
	}

	@GetMapping("/specified-char")
	public AlphabetPhoneticChar getChar(Character character) {
		character = Character.toUpperCase(character);
		AlphabetPhoneticChar[] arr = AlphabetPhoneticChar.values();
		int index = character - 'A';
		return arr[index];

	}

	@GetMapping("/random-char")
	public AlphabetPhoneticChar getRandomChar() {
		AlphabetPhoneticChar[] arr = AlphabetPhoneticChar.values();
		return arr[(int) (Math.random() * arr.length)];
	}

}
