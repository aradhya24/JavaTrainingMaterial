package OCP.fd_intrest_calculator.model;

public class FixedDeposit {
	private Integer accountNumber;
	private String name;
	private Double principal;
	private Integer duration;
	FestivalType festivalType;
	
	public FixedDeposit() {
	}

	public FixedDeposit(Integer accountNumber, String name, Double principal, Integer duration,
			FestivalType festivalType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festivalType = festivalType;
	}

	

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public FestivalType getFestivalType() {
		return festivalType;
	}

	public void setFestivalType(FestivalType festivalType) {
		this.festivalType = festivalType;
	}
	
	
	public Double calculateSimpleInterest(IFestivalInterest interest) {
		Double simpleInterest = (principal + interest.getInterestRate() + duration)/100;
		return simpleInterest;
	}

}
