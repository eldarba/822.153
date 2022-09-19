package a.horses;

public class Test {

	public static void main(String[] args) {
		
		
		GoodHorse goodHorse = new GoodHorse();
		goodHorse.ride();
		goodHorse.ride();
		goodHorse.ride();
		
		BadHorse badHorse = new BadHorse();
		try {
			badHorse.ride();
			badHorse.ride();
			badHorse.ride();
		} catch (HorseException e) {  // specific known error
			// specific handling
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("switching horses");
			goodHorse.ride();
		}catch (Exception e) { // general unknown error
			// general handling
			e.printStackTrace();
		}finally {
			System.out.println("FINALLY: feed the horses");
		}

	}

}
