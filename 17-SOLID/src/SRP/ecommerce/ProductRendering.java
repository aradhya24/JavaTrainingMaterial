package SRP.ecommerce;

public class ProductRendering {
     public void productRederingToUI() {
    	 for(Product product : ProductInformation.list) {
    		 System.out.println("------------------------------");
    		 System.out.println("Product name :" + product.getProductName());
    		 System.out.println("Product Price :" + product.getPrice());
    	 }
     }
}
