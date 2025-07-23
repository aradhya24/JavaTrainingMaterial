package DIP.ecommercenotification;

public class MainTest {

	public static void main(String[] args) {
		ApplicationDIP whatApplicationDIP = new ApplicationDIP(new WhatsappNotifier());
		whatApplicationDIP.send();

	}

}
