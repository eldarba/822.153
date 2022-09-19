package app.core;

public abstract class Product {
	
	private int barcode;
	private String name;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int barcode, String name, double price) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.price = price;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract String getDepartmentName();

	@Override
	public String toString() {
		return "Product [barcode=" + barcode + ", name=" + name + ", price=" + price + "]" + this.getClass().getSimpleName();
	}
	
	

}
