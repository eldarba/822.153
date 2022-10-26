package d;

public interface AcountDao {

	void deposit(int accountId, double amount);

	void withdraw(int accountId, double amount);
	
	double getBalance(int accountId);

}
