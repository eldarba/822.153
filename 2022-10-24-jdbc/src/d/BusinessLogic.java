package d;

public class BusinessLogic {
	
	private AcountDao acountDao = new  AcountDaoDb();
	
	public void transferMoney(double sum, int accountIdSrc, int accountIdDst) {
		acountDao.withdraw(accountIdSrc, sum);
		acountDao.deposit(accountIdDst, sum);
	}
	
	public static void main(String[] args) {
		BusinessLogic bl = new BusinessLogic();
		bl.transferMoney(5, 1, 2);
	}

}
