package ISP.fooddeleiveryplatform;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class CustomerUser implements ICustomerOps {

	@Override
	public void placeOrder() {
		System.out.println("Customer placed order..");
	}

	@Override
	public void trackOrder() {
		System.out.println("Customer is Tracking order..");
	}

	@Override
	public void rateDriver() {
		System.out.println("Customer rated driver..");
	}

	

}
