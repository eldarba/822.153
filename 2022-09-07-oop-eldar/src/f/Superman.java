package f;

public class Superman {

	private int altitude;
	
	// 2. create a static instance of Superman
	private static Superman instance = new Superman();
	
	
	// 3. a static get method to get the single instance
	public static Superman getInstance() {
		return instance;
	}

	// 1. private CTOR
	private Superman() { 
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return "Superman [altitude=" + altitude + "]";
	}

}
