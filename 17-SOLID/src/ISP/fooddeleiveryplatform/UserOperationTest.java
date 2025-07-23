package ISP.fooddeleiveryplatform;

public class UserOperationTest {

	public static void main(String[] args) {
		
        ICustomerOps customer  = new CustomerUser();
        customer.placeOrder();
        customer.trackOrder();
        customer.rateDriver();
        
        IRestaurantOps restuaurant = new RestaurantUser();
        restuaurant.manageRestaurant();
        restuaurant.trackOrder();
        
	}

}
