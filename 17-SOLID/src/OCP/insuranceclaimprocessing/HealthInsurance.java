package OCP.insuranceclaimprocessing;

public class HealthInsurance extends ClaimProcessor{
  
	@Override
	String getInsuranceType() {
		return "HEALTH INSURANCE";
	}
}
