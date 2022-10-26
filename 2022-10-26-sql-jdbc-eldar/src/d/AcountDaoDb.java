package d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			throw new RuntimeException("deposit faild", e);
		}

	}

	@Override
	public void withdraw(int accountId, double amount) {
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);) {
			String sql = "update `account` set balance = balance - ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			if (Math.random() < 0.5) {
				throw new RuntimeException("withdraw failed - test error");
			}
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, accountId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("withdraw faild", e);
		}

	}

	@Override
	public double getBalance(int accountId) {
		String sql = "select balance from account where id = ?";
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, accountId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				double balance = rs.getDouble("balance");
				return balance;
			} else {
				// there is no such account
				throw new RuntimeException("getBalance faild - no such account: " + accountId);
			}
		} catch (SQLException e) {
			throw new RuntimeException("getBalance faild", e);
		}
	}

}
