package SOLID.InventoryMS.model;

public class Product {
	private String productName;
	private int stock;
	private double pricePerUnit;
	private int reorderThreshold;

	public Product(String productName, int stock, double pricePerUnit, int reorderThreshold) {
		super();
		this.productName = productName;
		this.stock = stock;
		this.pricePerUnit = pricePerUnit;
		this.reorderThreshold = reorderThreshold;
	}

	public String getProductName() {
		return productName;
	}

	public int getStock() {
		return stock;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public int getReorderThreshold() {
		return reorderThreshold;
	}

	public void addStock(int quantity) {
		stock += quantity;
	}

	public void removeStock(int quantity) {
		stock -= quantity;
	}

}
