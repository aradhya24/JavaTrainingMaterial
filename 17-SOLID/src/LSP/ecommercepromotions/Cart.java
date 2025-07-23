package LSP.ecommercepromotions;

public class Cart {
	
	private int quantity;
	private double totalPrice;
	
	public Cart() {
	}
	
	public Cart(int quantity, double totalPrice) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}



	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	

}
