package a.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BusinessLogic {

	private AcountDao acountDao = new AcountDaoDb();
	private String dbUrl = "jdbc:mysql://localhost:3306/db3";
	private String dbUser = "root";
	private String dbPassword = "1234";

	/**
	 * @param from   the id of the source account
	 * @param to     the id of the destination account
	 * @param amount sum of money to transfer
	 */
	public void transfer(int from, int to, double amount) {
		try(Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
			try{
				// --- start transaction
				con.setAutoCommit(false);
				// part 1 of the transaction - withdraw
				double balance = acountDao.getBalance(con, from);
				if (amount <= balance) {
					acountDao.withdraw(con, from, amount);
				} else {
					throw new RuntimeException("withdraw failed - insufficient funds");
				}
				
				// part 2 of the transaction
				acountDao.deposit(con, to, amount);
				
				// --- commit - end transaction
				con.commit();
			}catch(Exception e) {
				// --- rollback - end transaction
				con.rollback();
				throw new RuntimeException("transfer failed", e);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("transfer failed", e);
		}
	} 

	public void deposit(int acountId, double sum) {
		try(Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)){
			acountDao.deposit(con, acountId, sum);
		} catch (SQLException e) {
			throw new RuntimeException("deposit failed", e);
		}
	}

	public void withdraw(int acountId, double sum) {
		try(Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)){
			double balance = acountDao.getBalance(con, acountId);
			if (sum <= balance) {
				acountDao.withdraw(con, acountId, sum);
			} else {
				throw new RuntimeException("withdraw failed - insufficient funds");
			}
		} catch (SQLException e) {
			throw new RuntimeException("withdraw failed", e);
		}
	}

}
