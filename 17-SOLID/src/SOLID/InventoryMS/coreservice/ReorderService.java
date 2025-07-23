package SOLID.InventoryMS.coreservice;

import SOLID.InventoryMS.model.Product;

public class ReorderService {
	
	public void reorder(Product product, int quantity) {
		product.addStock(quantity);
		System.out.println("Reorder placed for " + quantity + " units of '" + product.getProductName() + "'");
	}

}
