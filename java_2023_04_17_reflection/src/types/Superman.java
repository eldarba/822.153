package types;

public class Superman {
	
	private static Superman instance = new Superman();

	private int altitude;


	private Superman() {

	}

	public static Superman getInstance() {
		return instance;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	
}
