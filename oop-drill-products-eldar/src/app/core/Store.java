package app.core;

public class Store {

	private int numberOfProducts;

	private Food[] foods = new Food[1000];
	private Electricity[] electricities = new Electricity[1000];
	private Clothing[] clothings = new Clothing[1000];

	public void addProduct(Product product) {
		if (numberOfProducts < 1000) {
			if (product instanceof Food) {
				for (int i = 0; i < foods.length; i++) {
					if (foods[i] == null) {
						foods[i] = (Food) product;
						numberOfProducts++;
						return;
					}
				}
			}
			if (product instanceof Electricity) {
				for (int i = 0; i < electricities.length; i++) {
					if (electricities[i] == null) {
						electricities[i] = (Electricity) product;
						numberOfProducts++;
						return;
					}
				}
			}
			if (product instanceof Clothing) {
				for (int i = 0; i < clothings.length; i++) {
					if (clothings[i] == null) {
						clothings[i] = (Clothing) product;
						numberOfProducts++;
						return;
					}
				}
			}
		}

	}

	public Product getProduct(int barcode) {
		for (Clothing product : clothings) {
			if (product != null && product.getBarcode() == barcode) {
				return product;
			}
		}
		for (Food product : foods) {
			if (product != null && product.getBarcode() == barcode) {
				return product;
			}
		}
		for (Electricity product : electricities) {
			if (product != null && product.getBarcode() == barcode) {
				return product;
			}
		}
		return null;
	}

	public Product[] getAllProducts() {
		int i = 0;
		Product[] products = new Product[this.numberOfProducts];

		for (Product product : this.clothings) {
			if (product != null) {
				products[i++] = product;
			}
		}
		for (Product product : this.foods) {
			if (product != null) {
				products[i++] = product;
			}
		}
		for (Product product : this.electricities) {
			if (product != null) {
				products[i++] = product;
			}
		}

		return products;
	}

	public Product[] getAllProductsByDepartment(SubDepartmentName subDepartmentName) {
		Product[] products = new Product[this.numberOfProducts];
		int i = 0;
		for (Product product : this.clothings) {
			if (product != null && product.getDepartmentName().equals(subDepartmentName.name())) {
				products[i++] = product;
			}
		}
		for (Product product : this.electricities) {
			if (product != null && product.getDepartmentName().equals(subDepartmentName.name())) {
				products[i++] = product;
			}
		}
		for (Product product : this.foods) {
			if (product != null && product.getDepartmentName().equals(subDepartmentName.name())) {
				products[i++] = product;
			}
		}

		return products;
	}
	
	

}
