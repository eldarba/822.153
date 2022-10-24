package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * 
 * this class is a JDBC implementation for the UsersDao interface
 * 
 * @author Eldar
 *
 */
public class UserDaoDb implements UserDao {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/db3";
	private String dbUser = "root";
	private String dbPassword = "1234";

	@Override
	public int create(User user) throws UsersException {
		String sql = "insert into users values(0, '" + user.getName() + "', '" + user.getEmail() + "')";
		try(Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);) {
			
			return 0;
		} catch (SQLException e) {
			throw new UsersException("create user failed", e);
		}
	}

	@Override
	public User read(int id) throws UsersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> readAll() throws UsersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) throws UsersException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws UsersException {
		// TODO Auto-generated method stub

	}

}
