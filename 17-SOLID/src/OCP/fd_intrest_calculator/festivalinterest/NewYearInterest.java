package OCP.fd_intrest_calculator.festivalinterest;

import OCP.fd_intrest_calculator.model.IFestivalInterest;

public class NewYearInterest implements IFestivalInterest {

	@Override
	public Double getInterestRate() {
		return 8.0;
	}

}
