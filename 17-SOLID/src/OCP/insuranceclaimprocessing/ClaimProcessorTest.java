package OCP.insuranceclaimprocessing;

public class ClaimProcessorTest {
	public static void main(String[] args) {
		ClaimProcessor life = new LifeInsurance();
		life.setClaimType("Travel");
		System.out.println("Insurance Type : " + life.getInsuranceType() + "   Claim Type : " + life.getClaimType());
		
		ClaimProcessor health = new HealthInsurance();
		health.setClaimType("Property");
		System.out.println("Insurance Type : " + health.getInsuranceType() + "   Claim Type : " + health.getClaimType());
		
		ClaimProcessor vehicle = new VehicleInsurance();
		vehicle.setClaimType("Travel");
		System.out.println("Insurance Type : " + vehicle.getInsuranceType() + "   Claim Type : " + vehicle.getClaimType());
	}
}
