package app.core;

public class TShirt extends ManClothing {
	

	public TShirt(int barcode, String name, double price) {
		super(barcode, name, price);
		// TODO Auto-generated constructor stub
	}

	public TShirt() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDepartmentName() {
		return "ManClothing";
	}

}
