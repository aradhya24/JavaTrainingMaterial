package DIP.ecommercenotification;

public class ApplicationDIP {
	
	private IOrderService order;

	public ApplicationDIP(IOrderService order) {
		super();
		this.order = order;
	}
	
	public void send() {
		order.notification();
	}
	

}
