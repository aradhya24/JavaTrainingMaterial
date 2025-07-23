package SOLID.InventoryMS.valuation;

import java.util.Map;

import SOLID.InventoryMS.model.Product;

public class FIFOValuation implements IValuationStrategy{

	@Override
	public double calculateValue(Map<Product, Integer> inventory) {
		return inventory.entrySet().stream()
				.mapToDouble(entry -> entry.getKey().getPricePerUnit()*entry.getValue())
				.sum();
	}
     
}
