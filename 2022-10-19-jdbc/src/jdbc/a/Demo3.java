package jdbc.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eldar.person.Person;

public class Demo3 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";

		List<Person> list = new ArrayList<>();
		list.add(new Person("Ron", 25));
		list.add(new Person("Dan", 33));
		list.add(new Person("Dina", 85));

		try (Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();

			for (Person person : list) {
				String sql = "insert into `person` values(0, '" + person.getName() + "', " + person.getAge() + ")";
				stmt.executeUpdate(sql);
				System.out.println(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
