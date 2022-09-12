package app.core;

public class Client {

	private int id;
	private String name;
	private double balance;
	private Account[] accounts = new Account[5];
	private float commissionRate;
	private float interestRate;
	private Logger logger;

	public Client(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.logger = new Logger("tbd - enter the database driver name");
	}

	/**
	 * add the account to the array and log the operation by creating Log object
	 * with appropriate data and sending it to the Logger.log(..) method.. You
	 * should seek the array and place the Account where the first null value is
	 * found.
	 * 
	 * @param account
	 */
	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (this.accounts[i] == null) {
				this.accounts[i] = account;
				// log the operation
				long timestamp = System.currentTimeMillis();
				String description = "add account";
				float amount = account.getBalance();
				Log log = new Log(timestamp, this.id, description, amount);
				logger.log(log);
				//
				return;
			}
		}
		// if we are here
		System.out.println("addAccount failed - array full");
	}

	/**
	 * returns the account of the specified id or null if does not exist
	 * 
	 * @param accountId
	 * @return
	 */
	public Account getAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == accountId) {
				return accounts[i];
			}
		}
		return null;
	}

	/**
	 * removeAccount (int id) : void - remove the account with the same id from the
	 * array (by assigning a 'null' value to the array[position]) & transfers the
	 * money to the clients balance. Log the operation.
	 * 
	 * @param accountId
	 */
	public void removeAccount(int accountId) {

	}

	public void deposit(float amount) {
		this.balance += amount;
		float commission = amount * commissionRate;
		this.balance -= commission;
		// log the operation ================================================
		// prepare a Log instance
		long ts = System.currentTimeMillis();
		int id = this.id;
		String description = "deposit";
		Log log = new Log(ts, id, description, amount);
		// use the logger to log it
		logger.log(log);
		// ===================================================================
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

}
