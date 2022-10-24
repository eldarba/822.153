package b;

import java.util.Scanner;

public class Test1Create {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			UserDao dao = new UserDaoDb();

			User user = new User();
			System.out.println("enter name");
			user.setName(sc.nextLine());
			System.out.println("enter email");
			user.setEmail(sc.nextLine());
			sc.close();

			int id = dao.create(user);
			System.out.println(user + " added to database");
			System.out.println("id is: " + id);
		} catch (UsersException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
