package SOLID.InventoryMS.notification;

import SOLID.InventoryMS.model.Product;

public class EmailNotifier implements INotifier {

	@Override
	public void sendNotification(String message) {
		System.out.println("[Email]  Notification sent: '" +message+ "'");
	}

}
