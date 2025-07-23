package OCP.insuranceclaimprocessing;

public abstract class ClaimProcessor {

	String claimType;

	abstract String getInsuranceType();

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

}
