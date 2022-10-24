package c;

import java.util.Random;

import b.User;
import b.UserDao;
import b.UserDaoDb;

public class Tar2 {

	public static void main(String[] args) {
		Random random = new Random();
		String[] names = {"Dan", "Ran", "Dina", "Dor", "Yanki", "Roz", "Soli", "Ari", "Richard"};
		UserDao dao = new UserDaoDb();
		
		User user = new User();
		for (int i = 0; i < 100; i++) {
			String name = names[random.nextInt(names.length)];
			user.setName(name);
			user.setEmail(name.toLowerCase() + "@gmail.com");
			dao.create(user);
			System.out.println(user);
		}

	}

}
