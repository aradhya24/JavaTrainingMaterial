package LSP.ecommercepromotions;

public class NoDiscount implements IDiscount {

	@Override
	public void applyDiscount(Cart cart) {
		System.out.println("\n\nNo Discount Added");
		System.out.println("Total price: " + cart.getTotalPrice() + "   Quantity: " + cart.getQuantity());
	}

}
