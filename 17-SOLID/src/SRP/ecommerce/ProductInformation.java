package SRP.ecommerce;

import java.util.ArrayList;

public class ProductInformation {
    
	static ArrayList<Product> list = new ArrayList<>();
	
	public void storeProductInformation(String productName , double price) {
		list.add(new Product(productName,price)); 
	}
}
