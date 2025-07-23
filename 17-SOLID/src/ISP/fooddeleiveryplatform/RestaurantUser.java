package ISP.fooddeleiveryplatform;

public class RestaurantUser implements IRestaurantOps{

	@Override
	public void trackOrder() {
		System.out.println("Restaurant manager is Tracking order..");
	}

	@Override
	public void manageRestaurant() {
		System.out.println("Restaurant manager is Managing restaurant..");
	}

}
