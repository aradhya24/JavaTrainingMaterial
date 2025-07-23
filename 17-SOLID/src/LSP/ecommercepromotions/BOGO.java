package LSP.ecommercepromotions;

public class BOGO implements IDiscount {

	@Override
	public void applyDiscount(Cart cart) {
		System.out.println("\n\nBuy 1 get 1 is applied");
		System.out.println("Total price: " + cart.getTotalPrice() + "   Quantity: " + cart.getQuantity()*2);
	}

}
