package SRP.ecommerce;

public class ProductTest {
	public static void main(String[] args) {
	     
	     ProductInformation information = new ProductInformation();
	     ProductRendering rendering = new ProductRendering();
	     PriceCalculation calculation = new PriceCalculation();
	     
	     
	     
	     information.storeProductInformation("PEN", 1000.0);
	     information.storeProductInformation("RUBBER", 2000.0);
	     
	     System.out.println("Before Applying Discounts and taxes");
	     rendering.productRederingToUI();
	     
	     
	     
	     calculation.applyDiscount(10);
	     
	     System.out.println("\n\nAfter Applying Discounts");
	     rendering.productRederingToUI();
	     
	     
	     
	     calculation.applyTaxes(2);
	     
	     System.out.println("\n\nAfter Applying Taxes");
	     rendering.productRederingToUI();
	     
	     
	     
	}
}
