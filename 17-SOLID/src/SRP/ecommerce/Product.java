package SRP.ecommerce;

public class Product {
    String productName;
    double price;
    
    
    public Product() {
	}
    
	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	
	
	
	
	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    
    
}
