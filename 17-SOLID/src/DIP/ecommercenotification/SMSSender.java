package DIP.ecommercenotification;

public class SMSSender implements IOrderService {

	@Override
	public void notification() {
		System.out.println("SMS Notification...");
	}

}
