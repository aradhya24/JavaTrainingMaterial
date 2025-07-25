package SRP.ecommerce;

public class PriceCalculation {
	
     void applyDiscount(double percentage) {
    	 for(Product product : ProductInformation.list) {
    		 product.setPrice(product.getPrice()+(product.getPrice()*(percentage/100)));
    	 }
     }
     
     void applyTaxes(double taxPercentage) {
    	 for(Product product : ProductInformation.list) {
    		 product.setPrice(product.getPrice()-(product.getPrice()*(taxPercentage/100)));
    	 }
     }
}
