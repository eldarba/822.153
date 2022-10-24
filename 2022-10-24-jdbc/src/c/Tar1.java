package c;

import b.User;
import b.UserDao;
import b.UserDaoDb;

public class Tar1 {


	public static void main(String[] args) {
		
		UserDao dao = new UserDaoDb();
		User user = dao.read(3);
		user.setName(user.getName() + " Israeli");
		dao.update(user);
		System.out.println(user);

	}

}
