package DIP.ecommercenotification;

public class EmailSender implements IOrderService {

	@Override
	public void notification() {
		System.out.println("Email Notification...");
	}

}
