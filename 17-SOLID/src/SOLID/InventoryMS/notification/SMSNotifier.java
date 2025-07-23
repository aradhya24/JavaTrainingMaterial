package SOLID.InventoryMS.notification;

import SOLID.InventoryMS.model.Product;

public class SMSNotifier implements INotifier {

	@Override
	public void sendNotification(String message) {
		System.out.println("[SMS]  Notification sent: '" +message+ "'");
	}

}
