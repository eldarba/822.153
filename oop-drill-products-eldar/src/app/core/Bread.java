package app.core;

public class Bread extends BasicFood {
	
	
	

	public Bread(int barcode, String name, double price) {
		super(barcode, name, price);
		// TODO Auto-generated constructor stub
	}

	public Bread() {
	}

	@Override
	public String getDepartmentName() {
		return "BasicFood";
	}
	

}
