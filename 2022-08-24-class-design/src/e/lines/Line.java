package e.lines;

public class Line {

	private int length;

	public void print() {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
