package DIP.fintechloanplatform;

public class CreditScoreApi implements ILoanProcessor {

	@Override
	public void getThirdPartyApi() {
         System.out.println("Credit score API is fetched...");
	}

}
