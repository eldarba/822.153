package app.core;

public class TV extends HomeProducts {
	
	

	public TV(int barcode, String name, double price) {
		super(barcode, name, price);
	}

	public TV() {
	}

	@Override
	public String getDepartmentName() {
		return "HomeProducts";
	}

}
