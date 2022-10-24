package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db3";
		String user = "root";
		String password = "1234";
		
		String sql = "select * from users";
		
		try(Connection connection = DriverManager.getConnection(url, user, password);) {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			System.out.println(id + ", " + name + ", " + email);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(sql);
		}
		
		
		

	}

}
