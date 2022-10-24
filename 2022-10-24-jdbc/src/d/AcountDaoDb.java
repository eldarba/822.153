package d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcountDaoDb implements AcountDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/db3";
	private String dbUser = "root";
	private String dbPassword = "1234";

	@Override
	public void deposit(int accountId, double amount) {
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);) {
			String sql = "update `account` set balance = balance + ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			if (Math.random() < 0.5) {
				throw new RuntimeException("deposit failed - test error");
			}
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, accountId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void withdraw(int accountId, double amount) {
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);) {
			String sql = "update `account` set balance = balance - ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			if (Math.random() < 0.5) {
				throw new RuntimeException("deposit failed - test error");
			}
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, accountId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
