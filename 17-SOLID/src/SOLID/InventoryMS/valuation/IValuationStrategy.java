package SOLID.InventoryMS.valuation;

import java.util.Map;

import SOLID.InventoryMS.model.Product;

public interface IValuationStrategy {
    double calculateValue(Map<Product, Integer> inventory);
}
