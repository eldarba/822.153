package g.ui;

import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		UI ui = new UI();
		ui.start();
	}

	private Scanner sc = new Scanner(System.in);
	private boolean quit;

	public void start() {
		while (!quit) {
			showMenu();
			String choice = sc.nextLine();
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
				quit = true;
				break;
			}
		}

		System.out.println("Bye");
		sc.close();
	}

	public void showMenu() {
		System.out.println("== Menu =========");
		System.out.println("save ........... 1");
		System.out.println("delete ......... 2");
		System.out.println("update ......... 3");
		System.out.println("exit ........... x");
		System.out.print("Your choice: ");
	}

}
