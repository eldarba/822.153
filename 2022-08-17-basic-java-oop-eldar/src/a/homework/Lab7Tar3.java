package a.homework;

public class Lab7Tar3 {

	/*
	 * Assume: String str = “Sara Shara Shir Cameach”; 
	 * 
	 * Convert this String into char array
	 * 
	 * How many Vowels (A,E,I,O,U) letters inside the string?
	 */
	public static void main(String[] args) {
		
		String str = "Sara Shara Shir Cameach";
		// convert a String to char array
		char[] caracters = str.toCharArray();
		
		int vowels = 0;
		
		for (int i = 0; i < caracters.length; i++) {
			switch(caracters[i]) {
			case 'A', 'a', 'E', 'e','I', 'i', 'O', 'o', 'U', 'u':
				vowels++;
			}
		}
		
		System.out.println(str);
		System.out.println("vowels: " + vowels);

	}

}
