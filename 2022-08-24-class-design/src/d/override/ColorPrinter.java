package d.override;

public class ColorPrinter extends Printer {

	// method in sub class overrides inherited method
	@Override
	public void print(String text) {
		System.out.println("Color: " + text);
	}

}
