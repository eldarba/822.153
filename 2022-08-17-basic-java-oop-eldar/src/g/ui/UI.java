package g.ui;

import java.util.Scanner;

// define a class for UI interaction
public class UI {

	// set the needed fields
	private Scanner sc = new Scanner(System.in); // for input
	private boolean quit; // flag to know when to quit

	// set the desired menu according to the app operations
	public void showMenu() {
		System.out.println();
		System.out.println("== Menu =========");
		System.out.println("save ........... 1");
		System.out.println("delete ......... 2");
		System.out.println("update ......... 3");
		System.out.println("exit ........... x");
		System.out.print("Your choice: ");
	}

	// calling this method will start the interaction with the user
	public void start() {
		// loop that will show the menu again and again until the user choose to quit
		while (!quit) {
			showMenu(); // show the menu to the user
			String choice = sc.nextLine(); // get the user choice as input
			// act according to the user's choice (using switch)
			switch (choice) {
			case "1":
				System.out.println("saving");
				break;
			case "2":
				System.out.println("deleting");
				break;
			case "3":
				System.out.println("updating");
				break;
			case "x":
				// on exit change the flag so the loop will exit
				quit = true;
				break;
			}
		}

		// close the application
		System.out.println("Bye");
		sc.close();
	}

	// define a main method so this class is runnable
	public static void main(String[] args) {
		UI ui = new UI(); // create the UI object
		ui.start(); // start the UI object
	}

}
