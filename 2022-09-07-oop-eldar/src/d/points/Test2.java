package d.points;

public class Test2 {

	public static void main(String[] args) {
		
		Track track = new Track("Golan and Shomron");
		
		Point telAviv = new Point("Tel Aviv", 100, 50);
		Point golan = new Point("Golan", 10, 100);
		Point shomron = new Point("Shomron", 9, 3);
		
		track.addPoint(telAviv);
		track.addPoint(golan);
		track.addPoint(shomron);
		
		System.out.println(track);
		
		track.printTrack();

	}

}
