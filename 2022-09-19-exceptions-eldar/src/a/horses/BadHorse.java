package a.horses;

public class BadHorse {

	/**
	 * @throws HorseException 
	 * @throws RuntimeException in cases where the horse feels like it (50%)
	 */
	public void ride() throws HorseException  {
		if (Math.random() < 0.8) {
			System.out.println("bad horse riding");
		} else {
			throw new HorseException("Kick");
		}
	}

} 
