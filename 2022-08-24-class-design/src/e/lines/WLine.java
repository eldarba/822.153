package e.lines;

public class WLine extends Line {

	private int width;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void print() {
		for (int i = 0; i < width; i++) {
			super.print();
		}
	}

}
