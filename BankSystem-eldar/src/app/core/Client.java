package app.core;

public class Client {

	private int id;
	private String name;
	private double balance;
	private Account[] accounts = new Account[5];
	private float commissionRate;
	private float interestRate;
	private Logger logger = new Logger("tbd - enter the database driver name");

	public Client(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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
