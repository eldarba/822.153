package b;

import java.util.Scanner;

public class Test3Update {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			UserDao dao = new UserDaoDb();
			User user = new User();
			
			System.out.println("enter id");
			user.setId(Integer.parseInt(sc.nextLine()));
			System.out.println("enter name");
			user.setName(sc.nextLine());
			System.out.println("enter email");
			user.setEmail(sc.nextLine());
			
			dao.update(user);
			System.out.println("updated");
		} catch (UsersException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
