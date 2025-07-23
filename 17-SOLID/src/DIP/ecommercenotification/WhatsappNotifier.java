package DIP.ecommercenotification;

public class WhatsappNotifier implements IOrderService {

	@Override
	public void notification() {
		System.out.println("Whatsapp Notification...");
	}
}
