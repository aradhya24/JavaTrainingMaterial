package LSP.ecommercepromotions;

public class DiscountTest {

	public static void main(String[] args) {
         Cart cart = new Cart(20, 1000);
         
         IDiscount noDiscount = new NoDiscount();
         noDiscount.applyDiscount(cart);
         
         IDiscount percentageDiscount = new PercentageDiscount();
         percentageDiscount.applyDiscount(cart);
         
         IDiscount bogo = new BOGO();
         bogo.applyDiscount(cart);
	}

}
