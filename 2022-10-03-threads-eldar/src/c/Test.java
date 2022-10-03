package c;

public class Test {

	public static void main(String[] args) {
		
		Builder builder = new Builder(200, 100, "&");
		Cutter cutter = new Cutter(builder);
		
		builder.start();
		cutter.start();

	}

}
