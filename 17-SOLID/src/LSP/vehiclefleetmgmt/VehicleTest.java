package LSP.vehiclefleetmgmt;

public class VehicleTest {

	public static void main(String[] args) {
         
		IVehicle fuelType = new FuelVehicle();
		fuelType.refillType();
		
		IVehicle electricType = new ElectricVehicle();
		electricType.refillType();
	}

}
