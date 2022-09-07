package app.core;

public class Log {

	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	public Log(long timestamp, int clientId, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Log [timestamp=" + timestamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

//	public static void main(String[] args) {
//		Log log = new Log(0, 101, "test", 150);
//		System.out.println(log);
//	}

}
