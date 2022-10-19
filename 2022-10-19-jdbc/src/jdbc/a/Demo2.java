package jdbc.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		// create a table in db2
		String sql = "create table `person`(`id` int primary key auto_increment, `name` varchar(20), `age` int)";
		try(Connection con = DriverManager.getConnection(url, user, password);) {
			// we get a Statement object from the connection
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("table created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(sql);

	}

}
