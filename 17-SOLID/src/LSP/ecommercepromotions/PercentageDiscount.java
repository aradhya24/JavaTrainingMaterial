package LSP.ecommercepromotions;

public class PercentageDiscount implements IDiscount{
	@Override
	public void applyDiscount(Cart cart) {
		System.out.println("\n\n10% Discount Added");
		System.out.println("Total price: " + (cart.getTotalPrice()-(cart.getTotalPrice()*0.1)) + "   Quantity: " + cart.getQuantity());
	}
}
