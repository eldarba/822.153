package a.transactions;

public class BusinessLogic {

	private AcountDao acountDao = new AcountDaoDb();

	public void deposit(int acountId, double sum) {
		acountDao.deposit(acountId, sum);
	}

	public void withdraw(int acountId, double sum) {
		// we need to check balance
		double balance = acountDao.getBalance(acountId);
		if(balance <= sum) {
			acountDao.withdraw(acountId, sum);
		}else {
			throw new RuntimeException("withdraw failed - insufficient funds");
		}
	}

}
