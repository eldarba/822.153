package app.core.tests;

import app.core.Bread;
import app.core.Product;
import app.core.Store;
import app.core.SubDepartmentName;
import app.core.TShirt;
import app.core.TV;

public class Test {

	public static void main(String[] args) {
		Store store = new Store();
		store.addProduct(new TV(1, "color tv", 100));
		store.addProduct(new Bread(2, "black bread", 15));
		store.addProduct(new Bread(3, "ari bread", 15));
		store.addProduct(new TV(6, "black tv", 50));
		store.addProduct(new TShirt(4, "blue shirt", 200));

		Product[] products = store.getAllProducts();
		print(products);

		products = store.getAllProductsByDepartment(SubDepartmentName.BasicFood);
		print(products);

		products = store.getAllProductsByDepartment(SubDepartmentName.HomeProducts);
		print(products);

		System.out.println(store.getProduct(2));

	}

	public static void print(Product[] products) {
		System.out.println("===============products=========");
		for (Product product : products) {
			if (product != null) {
				System.out.println(product);
			}
		}
		System.out.println("================================");
	}

}
