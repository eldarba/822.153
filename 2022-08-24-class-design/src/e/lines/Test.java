package e.lines;

public class Test {

	public static void main(String[] args) {

		Line line = new Line();
		line.setLength(25);
		line.print();

		WLine wLine = new WLine();
		wLine.setLength(10);
		wLine.setWidth(2);

		wLine.print();

	}

}
