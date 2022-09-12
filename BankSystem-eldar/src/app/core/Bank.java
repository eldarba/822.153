package app.core;

public class Bank {

	private Client[] clients = new Client[100];
	private float balance;
	private Object accountUpdater; // not supported
	private Logger logger = new Logger(null);

	public float getBalance() {
		return balance;
	}

	public float getTotalClientFortune() {
		float fortune = 0;
		for (int i = 0; i < clients.length; i++) {
			if (this.clients[i] != null) {
				fortune += this.clients[i].getFortune();
			}
		}
		return fortune;
	}

	/**
	 * add the client to the array and log the operation. You should seek the array
	 * and place the Client where the first null value is found. ◦
	 * 
	 * @param client
	 */
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (this.clients[i] == null) {
				this.clients[i] = client;
				// log the operation
				Log log = new Log(System.currentTimeMillis(), client.getId(), "add client to bank",	client.getFortune());
				this.logger.log(log);
				//
				return;
			}
		}
	}

}
