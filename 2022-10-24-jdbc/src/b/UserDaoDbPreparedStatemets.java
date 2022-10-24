package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * this class is a JDBC implementation for the UsersDao interface
 * 
 * @author Eldar
 *
 */
public class UserDaoDbPreparedStatemets implements UserDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/db3";
	private String dbUser = "root";
	private String dbPassword = "1234";

	@Override
	public int create(User user) throws UsersException {
		String sql = "insert into users values(0, ?, ?)";
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);) {
			PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			// initialize the ? with real data
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			//
			pstmt.executeUpdate();
			ResultSet rsKeys = pstmt.getGeneratedKeys();
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
		String sql = "select * from users where id = ?";
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				User user = new User();
				user.setId(id);
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				return user;
			} else {
				throw new UsersException("read user faild - id " + id + " not found");
			}
		} catch (SQLException e) {
			throw new UsersException("read user failed", e);
		}
	}

	@Override
	public List<User> readAll() throws UsersException {
		String sql = "select * from users";
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<User> users = new ArrayList<>();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			throw new UsersException("read all failed", e);
		}
	}

	@Override
	public void update(User user) throws UsersException {
		String sql = "update users set name = '" + user.getName() + "', email = '" + user.getEmail() + "' ";
		sql += "where id = " + user.getId();
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			throw new UsersException("update user failed", e);
		}

	}

	@Override
	public void delete(int id) throws UsersException {
		String sql = "delete from users where id = " + id;
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);) {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(sql);
			throw new UsersException("delete user failed", e);
		}
	}

}
