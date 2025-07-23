package OCP.e_walletapp;

public class OfferEngineTest {

	public static void main(String[] args) {
		
		IOfferEngine upi = new UPITransaction();
		System.out.println("Upi transaction discount : " + upi.getDiscount() + "%");
		
		IOfferEngine card = new CardTransaction();
		System.out.println("Card transaction discount : " + card.getDiscount() + "%");
		
		IOfferEngine cash = new CashTransaction();
		System.out.println("Cash transaction discount : " + cash.getDiscount() + "%");

	}

}
