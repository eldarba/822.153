package a.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcountDaoDb implements AcountDao {
	

	@Override
	public void deposit(Connection con, int accountId, double amount) {
		String sql = "update `account` set balance = balance + ? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

			// test what happens in case something goes wrong
			if (Math.random() < 0.5) {
				throw new RuntimeException("deposit failed - test error");
			}
			//

			pstmt.setDouble(1, amount);
			pstmt.setInt(2, accountId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("deposit faild", e);
		}

	}

	@Override
	public void withdraw(Connection con, int accountId, double amount) {
		String sql = "update `account` set balance = balance - ? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

//			if (Math.random() < 0.5) {
//				throw new RuntimeException("withdraw failed - test error");
//			}
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, accountId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("withdraw faild", e);
		}

	}

	@Override
	public double getBalance(Connection con, int accountId) {
		String sql = "select balance from account where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			
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
