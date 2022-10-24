package b;

public class Test4Read {

	public static void main(String[] args) {

		int id = 3;
		
		try {
			UserDao dao = new UserDaoDb();
			User user = dao.read(id);
			System.out.println(user);
		} catch (UsersException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("END");
	} 

}
