package a.transactions;

import java.sql.Connection;

public interface AcountDao {

	void deposit(Connection con, int accountId, double amount);

	void withdraw(Connection con, int accountId, double amount);
	
	double getBalance(Connection con, int accountId);

}
