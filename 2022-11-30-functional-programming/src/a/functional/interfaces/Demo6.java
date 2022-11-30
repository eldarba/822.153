package a.functional.interfaces;

import java.util.function.Consumer;

import lombok.Data;

public class Demo6 {

	public static void main(String[] args) {

		Consumer<Line> twice = line -> line.setLength(line.getLength() * 2);

		Line line = new Line();
		line.setLength(10);
		System.out.println(line);

		twice.accept(line);
		System.out.println(line);

	}

}

@Data
class Line {
	private int length;
}
