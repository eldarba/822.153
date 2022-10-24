package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet rsKeys = stmt.getGeneratedKeys();
			rsKeys.next();
			int id = rsKeys.getInt(1);
			user.setId(id); // set the user id from the database
			return id; // return the generated id
		} catch (SQLException e) {
			System.out.println(sql);
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
