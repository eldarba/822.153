package c;

public class Test {

	public static void main(String[] args) {
		
		Builder builder = new Builder();
		Cutter cutter = new Cutter();
		builder.start();
		cutter.start();

	}

}
