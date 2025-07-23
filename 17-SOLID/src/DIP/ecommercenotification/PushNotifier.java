package DIP.ecommercenotification;

public class PushNotifier implements IOrderService {

	@Override
	public void notification() {
		System.out.println("Push Notification...");
	}

}
